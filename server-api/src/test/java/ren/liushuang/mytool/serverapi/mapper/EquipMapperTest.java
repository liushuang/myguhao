package ren.liushuang.mytool.serverapi.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;

import ren.liushuang.mytool.serverapi.model.equip.Equip;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EquipMapperTest {

    @Autowired
    private EquipMapper equipMapper;

    @Test
    public void testInsert(){
        StringBuilder sb = new StringBuilder();
        sb.append( "{\n");
        sb.append( "\t\t\"qixue\": 0,\n");
        sb.append( "\t\t\"max_expt_fashu\": 0,\n");
        sb.append( "\t\t\"lingli\": 115,\n");
        sb.append( "\t\t\"fair_show_end_time_left\": \"5\\u5206\\u949f\",\n");
        sb.append( "\t\t\"all_damage\": 0,\n");
        sb.append( "\t\t\"speed\": 0,\n");
        sb.append( "\t\t\"max_expt_fangyu\": 0,\n");
        sb.append( "\t\t\"appointed_roleid\": null,\n");
        sb.append( "\t\t\"addon_minjie\": 0,\n");
        sb.append( "\t\t\"server_name\": \"\\u9633\\u5149\\u57ce\",\n");
        sb.append( "\t\t\"highlights\": [\n");
        sb.append( "\t\t\t[\"\\u7b11\\u91cc\\u85cf\\u5200\", 80, {\n");
        sb.append( "\t\t\t\t\"key\": \"highlight_teji_0KbA77LYtbY=\"\n");
        sb.append( "\t\t\t}],\n");
        sb.append( "\t\t\t[\"\\u874e\\u5b50\\u7cbe\\u5957\", 70, {\n");
        sb.append( "\t\t\t\t\"key\": \"highlight_taozhuang_0KvX076rzNc=\"\n");
        sb.append( "\t\t\t}],\n");
        sb.append( "\t\t\t[\"\\u795e\\u519c\", 40, {\n");
        sb.append( "\t\t\t\t\"key\": \"highlight_texiao_yfHFqQ==\"\n");
        sb.append( "\t\t\t}]\n");
        sb.append( "\t\t],\n");
        sb.append( "\t\t\"init_hp\": 0,\n");
        sb.append( "\t\t\"init_defense\": 0,\n");
        sb.append( "\t\t\"bb_expt_gongji\": 0,\n");
        sb.append( "\t\t\"equip_count\": 1,\n");
        sb.append( "\t\t\"min_buyer_level\": 50,\n");
        sb.append( "\t\t\"area_name\": \"\\u5317\\u4eac2\\u533a\",\n");
        sb.append( "\t\t\"expt_kangfa\": 0,\n");
        sb.append( "\t\t\"max_expt_gongji\": 0,\n");
        sb.append( "\t\t\"magic_damage\": 0,\n");
        sb.append( "\t\t\"minjie\": 0,\n");
        sb.append( "\t\t\"suit_skill\": 0,\n");
//        sb.append("\t\t\"desc\": \"#r\\u7b49\\u7ea7 70  #r\\u7075\\u529b +149#r\\u8010\\u4e45\\u5ea6 230  \\u4fee\\u7406\\u5931\\u8d25 1\\u6b21#r\\u953b\\u70bc\\u7b49\\u7ea7 10  \\u9576\\u5d4c\\u5b9d\\u77f3 \\u820d\\u5229\\u5b50#Y#r#c4DBAF4\\u7279\\u6548\\uff1a#c4DBAF4\\u65e0\\u7ea7\\u522b\\u9650\\u5236#Y#r#c4DBAF4\\u5957\\u88c5\\u6548\\u679c\\uff1a\\u9644\\u52a0\\u72b6\\u6001\\u9006\\u9cde#Y#Y#r#G\\u5f00\\u8fd0\\u5b54\\u6570\\uff1a3\\u5b54/3\\u5b54 (\\u53cc3\\u5b54)#G#r\\u7b26\\u77f3: \\u4f24\\u5bb3 +1.5#n#G#r\\u7b26\\u77f3: \\u547d\\u4e2d +4#n#G#r\\u7b26\\u77f3: \\u529b\\u91cf +1#n#G#r\\u661f\\u4f4d\\uff1a\\u6cd5\\u4f24 +2#n#r#cEE82EE\\u7b26\\u77f3\\u7ec4\\u5408: \\u65e0\\u5fc3\\u63d2\\u67f3#r\\u95e8\\u6d3e\\u6761\\u4ef6\\uff1a\\u65e0#r\\u90e8\\u4f4d\\u6761\\u4ef6\\uff1a\\u65e0#r\\u666e\\u901a\\u7269\\u7406\\u653b\\u51fb\\u65f6\\u4f1a\\u9020\\u6210\\u6e85\\u5c04\\u6548\\u679c\\uff0c\\u5bf9\\u53e6\\u5916\\u4e24\\u4e2a\\u76ee\\u6807\\u9020\\u6210\\u6240\\u53d7\\u4f24\\u5bb320%\\u7684\\u4f24\\u5bb3\\uff0c\\u4ec5\\u5bf9NPC\\u4f7f\\u7528\\u65f6\\u6709\\u6548\\u3002#Y#r#W\\u5236\\u9020\\u8005\\uff1a\\u590f\\u5b87\\u8f69#Y#r#Y\\u7194\\u70bc\\u6548\\u679c\\uff1a#r#Y#r+21\\u7075\\u529b#Y  \"");
        sb.append( "\t\t\"desc\": \"#r\\u7b49\\u7ea7 80  #r\\u7075\\u529b +115#r\\u8010\\u4e45\\u5ea6 500#Y#r#c4DBAF4\\u7279\\u6280\\uff1a#c4DBAF4\\u7b11\\u91cc\\u85cf\\u5200#Y#Y#r#c4DBAF4\\u7279\\u6548\\uff1a#c4DBAF4\\u795e\\u519c#Y#r#c4DBAF4\\u5957\\u88c5\\u6548\\u679c\\uff1a\\u53d8\\u8eab\\u672f\\u4e4b\\u874e\\u5b50\\u7cbe#Y#Y#r#G\\u5f00\\u8fd0\\u5b54\\u6570\\uff1a1\\u5b54/3\\u5b54#Y   \",\n");
        sb.append( "\t\t\"school\": 0,\n");
        sb.append( "\t\t\"zongshang\": 0,\n");
        sb.append( "\t\t\"level\": 80,\n");
        sb.append( "\t\t\"fangyu\": 0,\n");
        sb.append( "\t\t\"equip_name\": \"\\u4e07\\u91cc\\u5377\\u4e91\",\n");
        sb.append( "\t\t\"magic_defense\": 0,\n");
        sb.append( "\t\t\"server_sn\": \"330\",\n");
        sb.append( "\t\t\"selling_time\": \"2019-01-10 14:49:44\",\n");
        sb.append( "\t\t\"xiang_qian_level\": 0,\n");
        sb.append( "\t\t\"equip_level_desc\": \"80\\u7ea7\",\n");
        sb.append( "\t\t\"mingzhong\": 0,\n");
        sb.append( "\t\t\"init_wakan\": 115,\n");
        sb.append( "\t\t\"is_collect\": 0,\n");
        sb.append( "\t\t\"equip_face_img\": \"2814.gif\",\n");
        sb.append( "\t\t\"create_time\": \"2018-10-17 09:08:19\",\n");
        sb.append( "\t\t\"equipid\": 3393421,\n");
        sb.append( "\t\t\"anti_fengyin\": 0,\n");
        sb.append( "\t\t\"bb_expt_fashu\": 0,\n");
        sb.append( "\t\t\"bb_expt_kangfa\": 0,\n");
        sb.append( "\t\t\"init_damage\": 0,\n");
        sb.append( "\t\t\"shanghai\": 0,\n");
        sb.append( "\t\t\"seller_nickname\": \"\\u89c5\\u6800\\u68ee\\u65c5\\uff0e\\u3089\",\n");
        sb.append( "\t\t\"expt_gongji\": 0,\n");
        sb.append( "\t\t\"expt_fangyu\": 0,\n");
        sb.append( "\t\t\"max_expt_kangfa\": 0,\n");
        sb.append( "\t\t\"addon_total\": 0,\n");
        sb.append( "\t\t\"mofa\": 0,\n");
        sb.append( "\t\t\"jinglian_level\": 0,\n");
        sb.append( "\t\t\"price_int\": 69900,\n");
        sb.append( "\t\t\"gem_level\": 0,\n");
        sb.append( "\t\t\"addon_skill_chance\": 0,\n");
        sb.append( "\t\t\"time_left\": \"13\\u592923\\u65f6\",\n");
        sb.append( "\t\t\"storage_type\": 1,\n");
        sb.append( "\t\t\"expt_fashu\": 0,\n");
        sb.append( "\t\t\"collect_num\": 2,\n");
        sb.append( "\t\t\"server_id\": 299,\n");
        sb.append( "\t\t\"score\": 0,\n");
        sb.append( "\t\t\"bb_expt_fangyu\": 0,\n");
        sb.append( "\t\t\"addon_effect_chance\": 0,\n");
        sb.append( "\t\t\"kindid\": 21,\n");
        sb.append( "\t\t\"addon_naili\": 0,\n");
        sb.append( "\t\t\"hp\": 0,\n");
        sb.append( "\t\t\"unit_price_desc\": \"\",\n");
        sb.append( "\t\t\"init_dex\": 0,\n");
        sb.append( "\t\t\"game_ordersn\": \"330_1539738499_332389169\",\n");
        sb.append( "\t\t\"fengyin\": 0,\n");
        sb.append( "\t\t\"defense\": 0,\n");
        sb.append( "\t\t\"eid\": \"201810170900113-299-GHFIZZVKO5HT\",\n");
        sb.append( "\t\t\"addon_fali\": 0,\n");
        sb.append( "\t\t\"addon_status\": 0,\n");
        sb.append( "\t\t\"tag\": \"softmax_fm\",\n");
        sb.append( "\t\t\"addon_lingli\": 0,\n");
        sb.append( "\t\t\"addon_tizhi\": 0,\n");
        sb.append( "\t\t\"init_damage_raw\": 0,\n");
        sb.append( "\t\t\"damage\": 0,\n");
        sb.append( "\t\t\"suit_effect\": 1072,\n");
        sb.append( "\t\t\"special_skill\": 1018,\n");
        sb.append( "\t\t\"equip_level\": 80,\n");
        sb.append( "\t\t\"addon_liliang\": 0,\n");
        sb.append( "\t\t\"status\": 2,\n");
        sb.append( "\t\t\"equip_type\": \"2814\",\n");
        sb.append( "\t\t\"price\": \"699.00\",\n");
        sb.append( "\t\t\"other_info\": \"{\\\"hole_num\\\": 1, \\\"add_melt_attrs\\\": [], \\\"agg_added_attrs\\\": [], \\\"summary\\\": \\\"\\\\u7075\\\\u529b +115 );\\\\u5f001\\\\u5b54\\\", \\\"highlight\\\": \\\"[[\\\\\\\"\\\\\\\\u7b11\\\\\\\\u91cc\\\\\\\\u85cf\\\\\\\\u5200\\\\\\\", 80, {\\\\\\\"key\\\\\\\": \\\\\\\"highlight_teji_0KbA77LYtbY=\\\\\\\"}], [\\\\\\\"\\\\\\\\u874e\\\\\\\\u5b50\\\\\\\\u7cbe\\\\\\\\u5957\\\\\\\", 70, {\\\\\\\"key\\\\\\\": \\\\\\\"highlight_taozhuang_0KvX076rzNc=\\\\\\\"}], [\\\\\\\"\\\\\\\\u795e\\\\\\\\u519c\\\\\\\", 40, {\\\\\\\"key\\\\\\\": \\\\\\\"highlight_texiao_yfHFqQ==\\\\\\\"}]]\\\", \\\"main_attrs\\\": [[\\\"\\\\u7075\\\\u529b\\\", \\\"+115\\\"]], \\\"desc\\\": \\\"#r\\\\u7b49\\\\u7ea7 80  #r\\\\u7075\\\\u529b +115#r\\\\u8010\\\\u4e45\\\\u5ea6 500#Y#r#c4DBAF4\\\\u7279\\\\u6280\\\\uff1a#c4DBAF4\\\\u7b11\\\\u91cc\\\\u85cf\\\\u5200#Y#Y#r#c4DBAF4\\\\u7279\\\\u6548\\\\uff1a#c4DBAF4\\\\u795e\\\\u519c#Y#r#c4DBAF4\\\\u5957\\\\u88c5\\\\u6548\\\\u679c\\\\uff1a\\\\u53d8\\\\u8eab\\\\u672f\\\\u4e4b\\\\u874e\\\\u5b50\\\\u7cbe#Y#Y#r#G\\\\u5f00\\\\u8fd0\\\\u5b54\\\\u6570\\\\uff1a1\\\\u5b54/3\\\\u5b54#Y   \\\"}\",\n");
        sb.append( "\t\t\"equip_type_desc\": \"\\u636e\\u8bf4\\u662f\\u5927\\u79b9\\u7559\\u4e0b\\u7684\\u5b9d\\u7269\\uff0c\\u4f69\\u5e26\\u5728\\u8eab\\u4e0a\\u6709);\\u6781\\u5f3a\\u7684\\u4f5c\\u7528\\u3002#r\\u3010\\u88c5\\u5907\\u6761\\u4ef6\\u3011\\u7b49\\u7ea780\\n\",\n");sb.append( "\t\t\"expire_time\": \"13\\u592923\\u65f6\",\n");
        sb.append( "\t\t\"serverid\": 299,\n");
        sb.append( "\t\t\"icon\": 0,\n");
        sb.append( "\t\t\"special_effect\": [6],\n");
        sb.append( "\t\t\"gem_value\": 0,\n");
        sb.append( "\t\t\"seller_roleid\": \"47409125\"\n");
        sb.append( "\t}");
        Equip equip = JSONObject.parseObject(sb.toString(),Equip.class);
        int result = equipMapper.insert(equip);
        Assert.assertTrue(result >0);
    }
}
