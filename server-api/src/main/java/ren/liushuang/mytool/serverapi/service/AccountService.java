package ren.liushuang.mytool.serverapi.service;

import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;

import lombok.extern.slf4j.Slf4j;
import ren.liushuang.mytool.serverapi.entity.BangpaijinengEntity;
import ren.liushuang.mytool.serverapi.entity.ChongwuxiulianEntity;
import ren.liushuang.mytool.serverapi.entity.JinengType;
import ren.liushuang.mytool.serverapi.entity.RenwuxiulianEntity;
import ren.liushuang.mytool.serverapi.entity.ShimenjinengEntity;
import ren.liushuang.mytool.serverapi.entity.XiulianType;
import ren.liushuang.mytool.serverapi.mapper.BangpaiJinengRepository;
import ren.liushuang.mytool.serverapi.mapper.ChongwuXiulianRepository;
import ren.liushuang.mytool.serverapi.mapper.RenwuXiulianRepository;
import ren.liushuang.mytool.serverapi.mapper.ShimenJinengRepository;
import ren.liushuang.mytool.serverapi.model.account.Account;
import ren.liushuang.mytool.serverapi.utils.AccountConverter;
import ren.liushuang.mytool.serverapi.utils.NeteasyUtil;
import ren.liushuang.mytool.serverapi.view.AccountView;
import ren.liushuang.mytool.serverapi.view.ChongwuXiulianView;
import ren.liushuang.mytool.serverapi.view.DiscountConfig;
import ren.liushuang.mytool.serverapi.view.FuzhuJinengView;
import ren.liushuang.mytool.serverapi.view.RenwuXiulianView;
import ren.liushuang.mytool.serverapi.view.ShimenJinengView;

@Service
@Slf4j
public class AccountService {

    @Autowired
    private RenwuXiulianRepository renwuXiulianRepository;

    @Autowired
    private ChongwuXiulianRepository chongwuXiulianRepository;

    @Autowired
    private ShimenJinengRepository shimenJinengRepository;

    @Autowired
    private BangpaiJinengRepository bangpaiJinengRepository;

    private LoadingCache<String, AccountView> accountViewCache =
            CacheBuilder.newBuilder()
                        .expireAfterWrite(10, TimeUnit.MINUTES)
                        .build(new CacheLoader<String, AccountView>() {
                            @Override
                            public AccountView load(String key) throws Exception {
                                return calcAccountDirectly(key);
                            }
                        });

    public AccountView calcAccount(String url) {
        try {
            return accountViewCache.get(url);
        } catch (Exception e) {
            log.error("calcAccount error", e);
        }
        return null;
    }

    private AccountView calcAccountDirectly(String url){
        AccountView accountView = new AccountView();
        initConfig(accountView);

        String accountDataStr = NeteasyUtil.getByUrl(url);
        Account account = AccountConverter.parseFromJson(accountDataStr);

        long renwuXiulianCoin = calcRenwuXiulian(account);
        long chongwuXiulianCoin = calcChongwuXiulian(account);
        long shimenjinengCoin = calcShimenJineng(account);
        long fuzhujinengCoin = calcFuzhujineng(account, accountView);

        buildRenwuXiulianView(accountView, renwuXiulianCoin);
        buildChongwuXiulianView(accountView, chongwuXiulianCoin);
        buildShimenjinengView(accountView, shimenjinengCoin);
        buildFuzhujinengView(accountView, fuzhujinengCoin);
        return accountView;
    }
    private void buildFuzhujinengView(AccountView accountView, long fuzhujinengCoin) {
        FuzhuJinengView fuzhuJinengView = new FuzhuJinengView();

        fuzhuJinengView.setCoin(fuzhujinengCoin);
        fuzhuJinengView.setMoney((long) (fuzhujinengCoin / accountView.getDiscountConfig().getCoinMoneyRate()));
        accountView.setFuzhuJinengView(fuzhuJinengView);
    }

    private long calcFuzhujineng(Account account, AccountView accountView) {
        long totalCoin = 0;
        Set<Integer> fuzhujinengId = bangpaiJinengRepository.getBangpaiJinengIdSet();
        for (Entry<Integer, Integer> entry : account.getAllSkills().entrySet()) {
            // 只处理辅助技能
            if (fuzhujinengId.contains(entry.getKey())) {
                JinengType type = JinengType.NORMAL;
                if (Objects.equals(entry.getKey(), 230) || Objects.equals(entry.getKey(), 237)) {
                    type = JinengType.QIANGZHUANG;
                }
                BangpaijinengEntity bangpaiJineng = bangpaiJinengRepository.getBangpaiJineng(entry.getValue(),
                                                                                             type);

                totalCoin += bangpaiJineng.getCoinTotal() +
                             // 计算帮贡成本
                             bangpaiJineng.getBanggongTotal() * accountView.getDiscountConfig()
                                                                           .getBanggongToCoinRate();
            }
        }
        return totalCoin;
    }

    private void buildShimenjinengView(AccountView accountView, long shimenjinengCoin) {
        ShimenJinengView shimenJinengView = new ShimenJinengView();
        shimenJinengView.setCoin(shimenjinengCoin);
        shimenJinengView.setMoney((long) (shimenjinengCoin / accountView.getDiscountConfig().getCoinMoneyRate()));
        accountView.setShimenJinengView(shimenJinengView);
    }

    private long calcShimenJineng(Account account) {
        long totalCoin = 0;
        for(Entry<Integer, Integer> entry : account.getAllSkills().entrySet()){
            // 只处理师门技能
            if(entry.getKey() > 0 && entry.getKey() <=132 ){
                ShimenjinengEntity shimenJinengEntity = shimenJinengRepository.getShimenJinengEntity(
                        entry.getValue());
                totalCoin += shimenJinengEntity.getCoinTotal();
            }
        }
        return totalCoin;
    }

    private void buildChongwuXiulianView(AccountView accountView, long chongwuXiulianCoin) {
        ChongwuXiulianView chongwuXiulianView = new ChongwuXiulianView();
        chongwuXiulianView.setCoin(chongwuXiulianCoin);
        chongwuXiulianView.setMoney((long) (chongwuXiulianCoin / accountView.getDiscountConfig().getCoinMoneyRate()));
        accountView.setChongwuXiulianView(chongwuXiulianView);
    }

    private long calcChongwuXiulian(Account account) {
        List<ChongwuxiulianEntity> skillList = Lists.newArrayList();
        skillList.add(chongwuXiulianRepository.getChongwuXiulianEntity(account.getChongwuXiulian().getIBeastSki1()));
        skillList.add(chongwuXiulianRepository.getChongwuXiulianEntity(account.getChongwuXiulian().getIBeastSki2()));
        skillList.add(chongwuXiulianRepository.getChongwuXiulianEntity(account.getChongwuXiulian().getIBeastSki3()));
        skillList.add(chongwuXiulianRepository.getChongwuXiulianEntity(account.getChongwuXiulian().getIBeastSki4()));

        long totalCoin = 0;
        for(ChongwuxiulianEntity skill : skillList){
            totalCoin += skill.getCoinTotal() + skill.getExtraCoinTotal();
        }

        return totalCoin;
    }

    private void initConfig(AccountView accountView) {
        DiscountConfig discountConfig = new DiscountConfig();
        accountView.setDiscountConfig(discountConfig);
    }

    private void buildRenwuXiulianView(AccountView accountView, long renwuXiulianCoin) {
        RenwuXiulianView renwuXiulianView = new RenwuXiulianView();
        renwuXiulianView.setCoin(renwuXiulianCoin);
        renwuXiulianView.setMoney(
                (long) (renwuXiulianCoin / accountView.getDiscountConfig().getCoinMoneyRate()));
        accountView.setRenwuXiulianView(renwuXiulianView);
    }

    private long calcRenwuXiulian(Account account) {
        long totalCoin = 0;
        RenwuxiulianEntity gongji = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIExptSki1(), XiulianType.GONGJI);
        RenwuxiulianEntity fangyu = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIExptSki2(), XiulianType.FANGYU);
        RenwuxiulianEntity fashu = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIExptSki3(), XiulianType.GONGJI);
        RenwuxiulianEntity fafang = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIExptSki4(), XiulianType.FANGYU);
        RenwuxiulianEntity lieshu = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIExptSki5(), XiulianType.GONGJI);

        RenwuxiulianEntity gongjiMax = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIMaxExpt1(), XiulianType.GONGJI_MAX);
        RenwuxiulianEntity fangyuMax = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIMaxExpt2(), XiulianType.FANGYU_MAX);
        RenwuxiulianEntity fashuMax = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIMaxExpt3(), XiulianType.GONGJI_MAX);
        RenwuxiulianEntity fafangMax = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIMaxExpt4(), XiulianType.FANGYU_MAX);

        totalCoin += gongji.getCoinTotal();
        totalCoin += fangyu.getCoinTotal();
        totalCoin += fashu.getCoinTotal();
        totalCoin += fafang.getCoinTotal();
        totalCoin += lieshu.getCoinTotal();

        totalCoin += gongjiMax.getCoinTotal();
        totalCoin += fangyuMax.getCoinTotal();
        totalCoin += fashuMax.getCoinTotal();
        totalCoin += fafangMax.getCoinTotal();
        return totalCoin;
    }
}
