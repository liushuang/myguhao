package ren.liushuang.mytool.serverapi.spider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import ren.liushuang.mytool.serverapi.mapper.EquipMapper;
import ren.liushuang.mytool.serverapi.model.equip.Equip;
import ren.liushuang.mytool.serverapi.utils.EquipConverter;
import ren.liushuang.mytool.serverapi.utils.NeteasyUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchEquip {

    @Autowired
    private EquipMapper equipMapper;

    @Test
    public void searchEquip() throws Exception {
        int finish = 0;
        int totalPage = 5;
        String baseUrl =
                "https://recommd.xyq.cbg.163.com/cgi-bin/recommend.py?callback=Request.JSONP.request_map.request_4&act=recommd_by_role&level_min=60&level_max=160&kindid=21&server_type=3&sum_attr_without_melt=1&count=15&search_type=overall_search_equip&view_loc=overall_search";
        for (int i = 1; i <= totalPage; i++) {
            String url = baseUrl + "&page=" + i;
            url += "&_=" + System.currentTimeMillis();
            String equipListStr = NeteasyUtil.getEquipByUrl(url);
            JSONObject resultJson = JSONObject.parseObject(equipListStr);
            JSONArray equips = resultJson.getJSONArray("equips");
            for (int j = 0; j < equips.size(); j++) {
                Equip equip = EquipConverter.convertFromString(equips.getJSONObject(j).toJSONString());
                try {
                    equipMapper.insert(equip);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("total=" + totalPage + "\tfinish=" + ++finish);
            Thread.sleep(10000);
        }
    }
}
