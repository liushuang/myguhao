package ren.liushuang.mytool.serverapi.utils;

import java.util.Map;
import java.util.Map.Entry;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;

import ren.liushuang.mytool.serverapi.model.account.Account;
import ren.liushuang.mytool.serverapi.model.account.ChongwuXiulian;
import ren.liushuang.mytool.serverapi.model.account.RenwuXiulian;

public class AccountConverter {
    public static Account parseFromJson(String accountDataStr) {

        Account account = new Account();
        JSONObject jsonObject = JSONObject.parseObject(accountDataStr);
        parseAllSkills(account, jsonObject);
        parseAllXiulian(account, jsonObject);
        return account;
    }

    private static void parseAllXiulian(Account account, JSONObject jsonObject) {
        RenwuXiulian renwuXiulian = new RenwuXiulian();
        ChongwuXiulian chongwuXiulian = new ChongwuXiulian();
        renwuXiulian.setIExptSki1(jsonObject.getInteger("iExptSki1"));
        renwuXiulian.setIExptSki2(jsonObject.getInteger("iExptSki2"));
        renwuXiulian.setIExptSki3(jsonObject.getInteger("iExptSki3"));
        renwuXiulian.setIExptSki4(jsonObject.getInteger("iExptSki4"));
        renwuXiulian.setIExptSki5(jsonObject.getInteger("iExptSki5"));
        renwuXiulian.setIMaxExpt1(jsonObject.getInteger("iMaxExpt1"));
        renwuXiulian.setIMaxExpt2(jsonObject.getInteger("iMaxExpt2"));
        renwuXiulian.setIMaxExpt3(jsonObject.getInteger("iMaxExpt3"));
        renwuXiulian.setIMaxExpt4(jsonObject.getInteger("iMaxExpt4"));

        chongwuXiulian.setIBeastSki1(jsonObject.getInteger("iBeastSki1"));
        chongwuXiulian.setIBeastSki2(jsonObject.getInteger("iBeastSki2"));
        chongwuXiulian.setIBeastSki3(jsonObject.getInteger("iBeastSki3"));
        chongwuXiulian.setIBeastSki4(jsonObject.getInteger("iBeastSki4"));
        account.setRenwuXiulian(renwuXiulian);
        account.setChongwuXiulian(chongwuXiulian);
    }

    private static void parseAllSkills(Account account, JSONObject jsonObject) {
        Map<String, Integer> allSkills = Maps.newHashMap();
        JSONObject allSkillsJson = jsonObject.getJSONObject("all_skills");
        for (Entry<String, Object> entry : allSkillsJson.entrySet()) {
            allSkills.put(entry.getKey(), Integer.valueOf(entry.getValue().toString()));
        }
        account.setAllSkills(allSkills);
    }
}
