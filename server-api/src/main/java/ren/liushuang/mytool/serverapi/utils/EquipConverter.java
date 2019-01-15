package ren.liushuang.mytool.serverapi.utils;

import com.alibaba.fastjson.JSONObject;

import ren.liushuang.mytool.serverapi.model.equip.Equip;

public class EquipConverter {
    public static Equip convertFromString(String jsonStr){
        Equip equip = JSONObject.parseObject(jsonStr, Equip.class);

        return equip;
    }
}
