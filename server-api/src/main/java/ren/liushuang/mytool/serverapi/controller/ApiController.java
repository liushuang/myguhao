package ren.liushuang.mytool.serverapi.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import ren.liushuang.mytool.serverapi.service.AccountService;

@Controller
public class ApiController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/calcAccount")
    @ResponseBody
    public JSONObject calc(@Param("url") String url){
        JSONObject result = new JSONObject();
        accountService.calcAccount(url);
        result.put("success", true);
        return result;
    }
}
