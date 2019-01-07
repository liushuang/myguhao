package ren.liushuang.mytool.serverapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
public class ApiController {

    @RequestMapping("/calc")
    @ResponseBody
    public JSONObject calc(){
        JSONObject result = new JSONObject();
        result.put("success", true);
        return result;
    }
}
