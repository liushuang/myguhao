package ren.liushuang.mytool.serverapi.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ren.liushuang.mytool.serverapi.view.AccountView;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testCalcAccount(){
        AccountView accountView = accountService.calcAccount(
                "https://xyq.cbg.163.com/equip?s=132&eid=201901061700113-132-FQM5T7WIZMM8&o&equip_refer=1");
        Assert.assertNotNull(accountView);
        Assert.assertNotNull(accountView.getRenwuXiulianView());
        Assert.assertNotNull(accountView.getChongwuXIulianView());
        Assert.assertNotNull(accountView.getShimenJinengView());
        Assert.assertNotNull(accountView.getFuzhuJinengView());

    }

    @Test
    public void testCalcAccount2(){
        AccountView accountView = accountService.calcAccount(
                "https://xyq.cbg.163.com/equip?s=229&eid=201901052200113-229-PULBF5C1YJN8&view_loc=equip_list");
        Assert.assertNotNull(accountView);
        Assert.assertNotNull(accountView.getRenwuXiulianView());

    }
}
