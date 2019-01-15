package ren.liushuang.mytool.serverapi.utils;

import org.junit.Assert;
import org.junit.Test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import ren.liushuang.mytool.serverapi.model.equip.Equip;

public class EquipConverterTest {

    @Test
    public void testConvert(){
        String url= "https://recommd.xyq.cbg.163.com/cgi-bin/recommend.py?callback=Request.JSONP.request_map.request_2&_=1547021700645&act=recommd_by_role&page=3&level_min=60&level_max=160&kindid=21&server_type=3&sum_attr_without_melt=1&count=15&search_type=overall_search_equip&view_loc=overall_search";
        String result = NeteasyUtil.getEquipByUrl(url);
        JSONObject jsonResult = JSONObject.parseObject(result);
        JSONArray equips = jsonResult.getJSONArray("equips");
        Equip equip = EquipConverter.convertFromString(equips.get(0).toString());
        Assert.assertNotNull(equip);
    }
}
