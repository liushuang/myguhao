package ren.liushuang.mytool.serverapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ren.liushuang.mytool.serverapi.entity.RenwuxiulianEntity;
import ren.liushuang.mytool.serverapi.entity.XiulianType;
import ren.liushuang.mytool.serverapi.mapper.RenwuXiulianRepository;
import ren.liushuang.mytool.serverapi.model.account.Account;
import ren.liushuang.mytool.serverapi.utils.AccountConverter;
import ren.liushuang.mytool.serverapi.utils.NeteasyUtil;

@Service
public class AccountService {

    @Autowired
    private RenwuXiulianRepository renwuXiulianRepository;

    public void calcAccount(String url){
        String accountDataStr= NeteasyUtil.getByUrl(url);
        Account account = AccountConverter.parseFromJson(accountDataStr);

        int renwuXiulianCoin = calcRenwuXiulian(account);
        System.out.println(account);
    }

    private int calcRenwuXiulian(Account account) {
        int totalCoin = 0;
        RenwuxiulianEntity gongji = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIExptSki1(), XiulianType.GONGJI);
        RenwuxiulianEntity fangyu = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIExptSki2(), XiulianType.FANGYU);
        RenwuxiulianEntity fashu = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIExptSki3(), XiulianType.GONGJI);
        RenwuxiulianEntity fafang = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIExptSki4(), XiulianType.FANGYU);
        RenwuxiulianEntity lieshu = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIExptSki5(), XiulianType.GONGJI);

        RenwuxiulianEntity gongjiMax = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIMaxExpt1(), XiulianType.GONGJI);
        RenwuxiulianEntity fangyuMax = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIMaxExpt2(), XiulianType.FANGYU);
        RenwuxiulianEntity fashuMax = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIMaxExpt3(), XiulianType.GONGJI);
        RenwuxiulianEntity fafangMax = renwuXiulianRepository.getRenwuXiulian(account.getRenwuXiulian().getIMaxExpt4(), XiulianType.FANGYU);

        totalCoin += gongji.getCoinTotal();
        return totalCoin;
    }
}
