package ren.liushuang.mytool.serverapi.utils;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;

public class Lpc2JsUtil {

    private static Map<String, String> convertDict = Maps.newHashMap();
    static{
        convertDict.put("\\(\\[", "{");
        convertDict.put("\\]\\)", "}");
        convertDict.put("\\,\\]\\)", "}");
        convertDict.put("\\(\\{", "[");
        convertDict.put("\\}\\)", "]");
        convertDict.put("\\,\\}\\)", "]");
    }
    public static JSONObject parse(String str){
        if(StringUtils.isNotEmpty(str)){
            for(Entry<String,String> entry : convertDict.entrySet()){
                str = str.replaceAll(entry.getKey(), entry.getValue());
            }
        }
        return JSONObject.parseObject(str);
    }
}
