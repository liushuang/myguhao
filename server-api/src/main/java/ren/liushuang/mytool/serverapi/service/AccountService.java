package ren.liushuang.mytool.serverapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ren.liushuang.mytool.serverapi.entity.RenwuxiulianEntity;
import ren.liushuang.mytool.serverapi.entity.XiulianType;
import ren.liushuang.mytool.serverapi.mapper.RenwuXiulianRepository;
import ren.liushuang.mytool.serverapi.model.account.Account;
import ren.liushuang.mytool.serverapi.utils.AccountConverter;
import ren.liushuang.mytool.serverapi.utils.NeteasyUtil;
import ren.liushuang.mytool.serverapi.view.AccountView;
import ren.liushuang.mytool.serverapi.view.DiscountConfig;
import ren.liushuang.mytool.serverapi.view.RenwuXiulianView;

@Service
public class AccountService {

    @Autowired
    private RenwuXiulianRepository renwuXiulianRepository;

    public AccountView calcAccount(String url){
        AccountView accountView = new AccountView();
        initConfig(accountView);

        String accountDataStr= NeteasyUtil.getByUrl(url);
        Account account = AccountConverter.parseFromJson(accountDataStr);

        int renwuXiulianCoin = calcRenwuXiulian(account);
        buildRenwuXiulianView(accountView,renwuXiulianCoin);

        System.out.println(account);
        return accountView;
    }

    private void initConfig(AccountView accountView) {
        DiscountConfig discountConfig = new DiscountConfig();
        accountView.setDiscountConfig(discountConfig);
    }

    private RenwuXiulianView buildRenwuXiulianView(AccountView accountView, int renwuXiulianCoin) {
        RenwuXiulianView renwuXiulianView = new RenwuXiulianView();
        renwuXiulianView.setCoin(renwuXiulianCoin);
        renwuXiulianView.setMoney(
                (int) (renwuXiulianCoin / accountView.getDiscountConfig().getCoinMoneyRate() * accountView
                        .getDiscountConfig().getTotalDiscount()));
        return renwuXiulianView;
    }

    private int calcRenwuXiulian(Account account) {
        int totalCoin = 0;
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
