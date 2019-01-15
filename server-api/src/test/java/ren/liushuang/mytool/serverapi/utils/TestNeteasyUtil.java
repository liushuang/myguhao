package ren.liushuang.mytool.serverapi.utils;

import org.junit.Assert;
import org.junit.Test;

public class TestNeteasyUtil {
    public static void main(String[] args){
        System.out.println(NeteasyUtil.getByUrl("https://xyq.cbg.163.com/equip?s=229&eid=201901052200113-229-PULBF5C1YJN8&view_loc=equip_list"));
    }

    @Test
    public void testGetEquip(){
        String str= "https://recommd.xyq.cbg.163.com/cgi-bin/recommend.py?callback=Request.JSONP.request_map.request_2&_=1547021700645&act=recommd_by_role&page=3&level_min=60&level_max=160&kindid=21&server_type=3&sum_attr_without_melt=1&count=15&search_type=overall_search_equip&view_loc=overall_search";
        String result = NeteasyUtil.getEquipByUrl(str);
        Assert.assertNotNull(result);
    }
}
