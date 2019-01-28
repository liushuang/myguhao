package ren.liushuang.mytool.serverapi.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import ren.liushuang.mytool.serverapi.service.AccountService;
import ren.liushuang.mytool.serverapi.view.AccountView;

@Controller
public class ApiController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/calcAccount")
    @ResponseBody
    public JSONObject calc(@Param("url") String url){
        try {
            url = URLDecoder.decode(url, "utf-8");
        } catch (UnsupportedEncodingException e) {
            // ignore
        }
        JSONObject result = new JSONObject();
        AccountView accountView = accountService.calcAccount(url);
        result.put("success", true);
        result.put("accountView", accountView);
        return result;
    }
}
