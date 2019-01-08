package ren.liushuang.mytool.serverapi.utils;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;


public class TestGson {

    @Test
    public void testGson(){
        String str= "{\"total_horse\":2,\"AllSummon\":[{\"growthMax\":1277,\"sjg\":0,\"lianshou\":0,\"summon_equip1\":{\"cDesc\":\"#r等级 105  #r命中率 +14% 伤害 +36 魔法 +62#r耐久度 524#Y#r#c4DBAF4套装效果：附加状态#c4DBAF4偷袭#Y#Y#r#W制造者：一〃塌糊涂#Y#r#r镶嵌效果 #r+50伤害 镶嵌等级：5\",\"iType\":9311,},\"summon_equip2\":{\"cDesc\":\"#r等级 105  #r伤害 +33 速度 +30#r耐久度 483#Y#r#c4DBAF4套装效果：附加状态#c4DBAF4偷袭#Y#Y#r#W制造者：xm丶鹈鹕#Y#r#r镶嵌效果 #r+6速度 镶嵌等级：1\",\"iType\":9211,},\"jj_extra_add\":0,\"summon_equip3\":{\"cDesc\":\"#r等级 105  #r伤害 +33 防御 +95#r耐久度 634#r#G#G力量 +5#Y#Y#r#c4DBAF4套装效果：附加状态#c4DBAF4偷袭#Y#Y#r#W制造者：Tercel°饕餮#Y#r#r镶嵌效果 #r+90气血 镶嵌等级：3\",\"iType\":9111,},\"csavezz\":\"1508|1321|1451|1460|3969|2661\",\"iGenius\":0,\"iColor\":1,\"MP_MAX\":3050,\"hp\":3969,\"iMagDef_all\":686,\"summon_color\":0,\"HP_MAX\":5500,\"ruyidan\":0,\"summon_equip4_type\":0,\"iGrade\":119,\"all_skills\":{\"316\":1,\"301\":1,\"305\":1,\"304\":1,},\"SPD_MAX\":1550,\"iMp_max\":1263,\"MS_MAX\":1800,\"summon_core\":{907:[5,0,{},],901:[5,0,{},],902:[5,0,{},],904:[5,0,{},],},\"qianjinlu\":0,\"core_close\":0,\"iJjFeedCd\":0,\"left_qlxl\":0,\"iHp_max\":3495,\"jinjie\":{\"core\":{},\"cnt\":7,\"lx\":99,\"new_type\":1,},\"iPoint\":0,\"dod\":1460,\"iBaobao\":1,\"iRealColor\":1,\"tmp_lingxing\":99,\"iCor_all\":362,\"yuanxiao\":0,\"summon_equip4_desc\":\"\",\"iHp\":3495,\"iType\":102710,\"iMag_all\":150,\"grow\":1264,\"mp\":2661,\"iAtt_all\":1761,\"life\":4603,\"att_rate\":14,\"iDod_All\":201,\"def\":1321,\"iDef_All\":679,\"iDex_All\":256,\"iSpe_all\":138,\"DEF_MAX\":1550,\"iAtt_F\":2,\"lastchecksubzz\":2019,\"att\":1508,\"ATK_MAX\":1550,\"iRes_all\":130,\"carrygradezz\":0,\"spe\":1451,\"iMp\":1263,\"iStr_all\":713,},{\"growthMax\":1236,\"sjg\":0,\"lianshou\":0,\"jj_extra_add\":0,\"csavezz\":\"1065|892|1050|1297|3787|1949\",\"iGenius\":0,\"MP_MAX\":3050,\"hp\":3787,\"iMagDef_all\":472,\"summon_color\":0,\"HP_MAX\":5500,\"iGrade\":116,\"all_skills\":{\"306\":1,\"411\":1,\"307\":1,\"403\":1,},\"summon_equip4_type\":0,\"ruyidan\":0,\"SPD_MAX\":1550,\"iMp_max\":891,\"MS_MAX\":1800,\"summon_core\":{910:[5,0,{},],},\"qianjinlu\":0,\"core_close\":0,\"iJjFeedCd\":0,\"left_qlxl\":7,\"iHp_max\":4496,\"jinjie\":{\"core\":{},\"cnt\":0,\"lx\":0,},\"iPoint\":5,\"dod\":1297,\"iBaobao\":0,\"iRealColor\":0,\"tmp_lingxing\":0,\"iCor_all\":581,\"yuanxiao\":0,\"summon_equip4_desc\":\"\",\"iHp\":4496,\"iType\":102071,\"iMag_all\":126,\"grow\":1164,\"mp\":1949,\"iAtt_all\":566,\"life\":4370,\"att_rate\":0,\"iDod_All\":251,\"def\":892,\"iDef_All\":507,\"iDex_All\":203,\"iSpe_all\":194,\"DEF_MAX\":1550,\"iAtt_F\":8,\"lastchecksubzz\":2019,\"att\":1065,\"ATK_MAX\":1550,\"iRes_all\":178,\"carrygradezz\":0,\"spe\":1050,\"iMp\":891,\"iStr_all\":126,},{\"growthMax\":1277,\"sjg\":0,\"lianshou\":0,\"summon_equip1\":{\"cDesc\":\"#r等级 115  #r命中率 +15%#r耐久度 244#r#G#G敏捷 +6#Y #G法力 +7#Y#Y#r#c4DBAF4套装效果：附加状态#c4DBAF4法术暴击#Y#Y#r#W制造者：偶然遇见你#Y\",\"iType\":9312,},\"summon_equip2\":{\"cDesc\":\"#r等级 115  #r速度 +38#r耐久度 308#r#G#G灵力 +7#Y #G法力 +6#Y#Y#r#c4DBAF4套装效果：附加状态#c4DBAF4法术暴击#Y#Y#r#W制造者：偶然遇见你#Y#r#r镶嵌效果 #r+6速度 镶嵌等级：1\",\"iType\":9212,},\"jj_extra_add\":0,\"summon_equip3\":{\"cDesc\":\"#r等级 115  #r防御 +110#r耐久度 236#r#G#G灵力 +12#Y#Y#r#c4DBAF4套装效果：附加状态#c4DBAF4法术暴击#Y#Y#r#W制造者：旋叶风#Y#r#r镶嵌效果 #r+30气血 镶嵌等级：1\",\"iType\":9112,},\"csavezz\":\"965|1025|1210|927|4737|2723\",\"iGenius\":429,\"MP_MAX\":3050,\"hp\":4737,\"iMagDef_all\":933,\"summon_color\":0,\"HP_MAX\":5500,\"ruyidan\":0,\"summon_equip4_type\":0,\"iGrade\":115,\"all_skills\":{\"424\":1,\"412\":1,\"309\":1,\"429\":1,\"661\":1,},\"SPD_MAX\":1550,\"iMp_max\":3958,\"MS_MAX\":1800,\"summon_core\":{931:[5,0,{},],905:[5,0,{},],906:[5,0,{},],904:[5,0,{},],},\"qianjinlu\":0,\"core_close\":0,\"iJjFeedCd\":0,\"left_qlxl\":0,\"iHp_max\":1770,\"jinjie\":{\"core\":{},\"cnt\":7,\"lx\":99,\"new_type\":1,},\"iPoint\":0,\"dod\":927,\"iBaobao\":1,\"iRealColor\":0,\"tmp_lingxing\":99,\"iCor_all\":148,\"yuanxiao\":0,\"summon_equip4_desc\":\"\",\"iHp\":1770,\"iType\":102211,\"iMag_all\":893,\"grow\":1244,\"mp\":2723,\"iAtt_all\":574,\"life\":899,\"att_rate\":15,\"iDod_All\":135,\"def\":1025,\"iDef_All\":597,\"iDex_All\":220,\"iSpe_all\":146,\"DEF_MAX\":1550,\"iAtt_F\":1,\"lastchecksubzz\":2019,\"att\":965,\"ATK_MAX\":1550,\"iRes_all\":130,\"carrygradezz\":0,\"spe\":1210,\"iMp\":3196,\"iStr_all\":150,},],\"iDesc\":0,\"shenqi_yellow\":\"0神器灵气：50#r\",\"rent_level\":0,\"iPride\":800,\"iNutsNum\":100,\"usernum\":9893195,\"iExptSki3\":17,\"iCGTotalAmount\":0,\"iBeastSki2\":2,\"ExpJwBase\":1000000000,\"iIcon\":5,\"iZhuanZhi\":0,\"iSchOffer\":170,\"iDamage_All\":953,\"iRace\":2,\"iCGBodyAmount\":0,\"iGrade\":109,\"TA_iAllPoint\":0,\"changesch\":[9,],\"iErrantry\":0,\"ExAvt\":{1:{\"cName\":\"夜影\",\"order\":1,\"iType\":12067,},3:{\"cName\":\"光剑足迹\",\"order\":6,\"iType\":14533,},7:{\"cName\":\"腾蛇炫卡\",\"order\":2,\"iType\":13112,},5:{\"cName\":\"蛮鬼铁盾\",\"order\":5,\"iType\":13993,},4:{\"cName\":\"夜影\",\"order\":4,\"iType\":13313,},6:{\"cName\":\"怀旧巨魔王炫卡\",\"order\":7,\"iType\":19287,},2:{\"cName\":\"动物装饰篮\",\"order\":3,\"iType\":14401,},},\"TA_iAllNewPoint\":3,\"ori_desc\":3072,\"iStr_All\":120,\"iMaxExpt3\":20,\"iPoint\":0,\"shenqi\":{\"attributes\":[{\"id\":1,\"disable\":0,\"attr\":\"速度 +4.5\",},{\"id\":2,\"disable\":1,\"attr\":\"气血 +0\",},{\"id\":8,\"disable\":0,\"attr\":\"伤害 +3\",},{\"id\":16,\"disable\":1,\"attr\":\"法术防御 +0\",},{\"id\":4,\"disable\":0,\"attr\":\"抵抗封印 +6\",},],\"full\":0,\"id\":6208,\"active\":1,\"power\":220,\"skill_desc\":\"被你的物理伤害攻击的单位在当回合内的法术伤害结果减少74点。\",\"skill_level\":1,\"skill\":53112,\"components\":[{\"wuxing\":[{\"wuxingshi_affix\":0,\"id\":1,\"wuxingshi_level\":1,\"affix_disable\":0,\"status\":0,\"attr\":\"速度 +2.2\",},{\"wuxingshi_affix\":0,\"id\":4,\"wuxingshi_level\":1,\"affix_disable\":0,\"status\":0,\"attr\":\"抵抗封印 +6\",},{\"wuxingshi_affix\":0,\"id\":8,\"wuxingshi_level\":1,\"affix_disable\":0,\"status\":0,\"attr\":\"伤害 +3\",},{\"wuxingshi_affix\":0,\"id\":1,\"wuxingshi_level\":1,\"affix_disable\":0,\"status\":0,\"attr\":\"速度 +2.2\",},],\"unlock\":1,\"level\":1,},{\"wuxing\":[{\"wuxingshi_affix\":0,\"id\":1,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"速度 +0\",},{\"wuxingshi_affix\":0,\"id\":1,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"速度 +0\",},{\"wuxingshi_affix\":0,\"id\":4,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"抵抗封印 +0\",},{\"wuxingshi_affix\":0,\"id\":4,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"抵抗封印 +0\",},],\"unlock\":0,\"level\":0,},{\"wuxing\":[{\"wuxingshi_affix\":0,\"id\":8,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"伤害 +0\",},{\"wuxingshi_affix\":0,\"id\":4,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"抵抗封印 +0\",},{\"wuxingshi_affix\":0,\"id\":4,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"抵抗封印 +0\",},{\"wuxingshi_affix\":0,\"id\":8,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"伤害 +0\",},],\"unlock\":0,\"level\":0,},],},\"iMagDef_All\":467,\"iMaxExpt2\":20,\"iCash\":65098,\"iExptSki1\":0,\"iSpe_All\":855,\"iMaxExpt1\":20,\"propKept\":{0:{\"iSpe\":174,\"iRes\":118,\"iCor\":123,\"iMag\":122,\"iStr\":698,},},\"i3FlyLv\":0,\"iBeastSki4\":1,\"AchPointTotal\":1560,\"iHp\":2485,\"energy\":83,\"iSumAmountEx\":0,\"iSchool\":11,\"iMp_Max\":762,\"bid\":0,\"AllEquip\":{189:{\"cDesc\":\"等级 100#r抵抗封印等级 +20#r耐久度 181#r精炼等级 1#r#G气血 +81 #cEE82EE[+28]#r#G抗物理暴击等级 +20 #cEE82EE[+8]#r#W制造者：＂乌贼＃强化打造#\",\"iType\":27203,},13:{\"cDesc\":\"#r等级 70  五行 火#r#r伤害 +148 命中 +184#r耐久度 450#Y  \",\"iType\":2408,},12:{\"cDesc\":\"#r等级 50  #r灵力 +86#r耐久度 258#r锻炼等级 3  镶嵌宝石 舍利子#Y#r#c4DBAF4特效：#c4DBAF4专注#Y#r#G开运孔数：1孔/2孔#Y #r#W制造者：挽梦#Y  \",\"iType\":2809,},9:{\"cDesc\":\"#W等级 60#W#r#Y未鉴定物品#Y  \",\"iType\":2107,},187:{\"cDesc\":\"等级 100#r伤害 +21#r耐久度 178#r精炼等级 2#r#G固定伤害 +10 #cEE82EE[+8]#r#G伤害 +10 #cEE82EE[+8]#r#W制造者：北城念梦强化打造#\",\"iType\":27003,},188:{\"cDesc\":\"等级 100#r法术防御 +21#r耐久度 179#r精炼等级 2#r#G固定伤害 +15 #cEE82EE[+8]#r#G封印命中等级 +10 #cEE82EE[+8]#r#G物理暴击等级 +10 #cEE82EE[+8]#r#W制造者：＂乌贼＃强化打造#\",\"iType\":27103,},2:{\"cDesc\":\"#r等级 100  五行 土#r#r气血 +120 防御 +168#r耐久度 382#r锻炼等级 3  镶嵌宝石 光芒石#r#G#G敏捷 +13#Y#Y#r#W制造者：中国品牌时代强化打造#Y  \",\"iType\":2652,},6:{\"cDesc\":\"#r等级 100  五行 水#r#r伤害 +384 命中 +415#r耐久度 415#r锻炼等级 5  镶嵌宝石 太阳石#r#G#G敏捷 +32#Y#Y#r#G开运孔数：1孔/4孔#Y #r#W制造者：神威·制造师强化打造#Y  \",\"iType\":1152,},1:{\"cDesc\":\"#r等级 100  五行 木#r#r魔法 +115 防御 +67#r耐久度 382  修理失败 1次#r锻炼等级 1  镶嵌宝石 月亮石#Y#r#G开运孔数：1孔/4孔#Y #r#W制造者：ㄣ四道封︵ミ#Y  \",\"iType\":2552,},3:{\"cDesc\":\"#r等级 100  五行 火#r#r敏捷 +36 防御 +57#r耐久度 186#Y#r#W制造者：客官一在这里强化打造#Y  \",\"iType\":2752,},10:{\"cDesc\":\"#r等级 60  五行 土#r#r防御 +80#r耐久度 400#r#G#G体质 +9#Y#Y#r#c4DBAF4套装效果：附加状态定心术#Y#Y  \",\"iType\":2616,},190:{\"cDesc\":\"等级 80#r速度 +14#r耐久度 263#r精炼等级 2#r#G抗法术暴击等级 +19 #cEE82EE[+16]#r#G气血 +56 #cEE82EE[+56]#r#G法术防御 +19 #cEE82EE[+16]#r#W制造者：0000财神000O强化打造#\",\"iType\":27302,},8:{\"cDesc\":\"#r等级 95  #r防御 +79#r耐久度 500#Y#r#c4DBAF4套装效果：附加状态#c4DBAF4高级反击#Y#Y#r#W制造者：☆杀☆神☆#Y  \",\"iType\":9110,},5:{\"cDesc\":\"#r等级 100  五行 金#r#r气血 +450 防御 +57#r耐久度 7  修理失败 3次#r锻炼等级 5  镶嵌宝石 光芒石#Y#r#G开运孔数：4孔/4孔#Y #r#W制造者：秀秀秀逗强化打造#Y#r#Y熔炼效果：#r#Y#r-1防御 +14气血 #r#Y  \",\"iType\":2952,},4:{\"cDesc\":\"#r等级 100  #r灵力 +155#r耐久度 465#r锻炼等级 4  镶嵌宝石 舍利子#Y#r#G开运孔数：4孔/4孔#Y #r#W制造者：御剑为红颜が强化打造#Y  \",\"iType\":2852,},},\"iSewski\":0,\"addPoint\":7,\"iDex_All\":648,\"outdoor_level\":0,\"iHp_Eff\":2610,\"ori_race\":2,\"iAtt_All\":721,\"datang_feat\":5950,\"iExptSki4\":15,\"iSaving\":0,\"fabao\":{1:{\"cDesc\":\"0#Y灵气：#G12 #Y 五行：#G金#Y#r修炼境界：第#G6#Y层 #cA6F101降龙伏虎#Y\",\"iType\":6003,},12:{\"cDesc\":\"0#W【回合限制】3#r#Y#Y灵气：#G300#Y 五行：#G火#Y#r修炼境界：第#G12#Y层 #cFF6F28法力无边#Y\",\"iType\":6052,},11:{\"cDesc\":\"0#Y灵气：#G275#Y 五行：#G水#Y#r修炼境界：第#G12#Y层 #cFF6F28笑傲西游#Y#r传送至北俱芦洲（36，150）\",\"iType\":6020,},},\"igoodness_sav\":76,\"iCor_All\":121,\"more_attr\":{\"attrs\":[{\"lv\":0,\"idx\":4,},{\"lv\":35,\"idx\":10,},{\"lv\":20,\"idx\":2,},{\"lv\":28,\"idx\":9,},{\"lv\":0,\"idx\":12,},{\"lv\":18,\"idx\":1,},{\"lv\":0,\"idx\":3,},{\"lv\":18,\"idx\":6,},{\"lv\":0,\"idx\":8,},{\"lv\":0,\"idx\":7,},{\"lv\":0,\"idx\":11,},{\"lv\":0,\"idx\":5,},{\"lv\":1107,\"idx\":13,},{\"lv\":467,\"idx\":14,},],},\"icolor_ex\":0,\"iSkiPoint\":3,\"normal_horse\":2,\"pet\":[],\"HugeHorse\":{58:{\"iSkillLevel\":0,\"cName\":\"穿云飞辇\",\"iSkill\":0,\"nosale\":0,\"iType\":11058,\"order\":2,},113:{\"iSkillLevel\":0,\"cName\":\"流云玉佩\",\"iSkill\":0,\"nosale\":0,\"iType\":11098,\"order\":1,},},\"iExptSki2\":14,\"iCGBoxAmount\":0,\"HeroScore\":64,\"iBeastSki3\":4,\"iBadness\":0,\"all_skills\":{\"86\":94,\"208\":32,\"198\":1,\"179\":1,\"30808\":1,\"170\":1,\"84\":119,\"212\":2,\"159\":1,\"30805\":1,\"52016\":1,\"87\":119,\"197\":1,\"169\":1,\"52032\":1,\"30806\":1,\"85\":119,\"173\":1,\"174\":1,\"89\":119,\"88\":119,\"206\":92,\"211\":2,\"202\":54,\"160\":5,\"230\":11,\"52031\":1,\"90\":85,\"30801\":1,\"196\":1,\"154\":6,\"201\":96,\"204\":36,},\"total_avatar\":7,\"iBeastSki1\":5,\"iOrgOffer\":0,\"rent\":0,\"iSumAmount\":8,\"xianyu\":400,\"iUpExp\":925970244,\"cName\":\"′封王．n1ce\",\"iMarry2\":0,\"iLearnCash\":1388646,\"idbid_desc\":[],\"iMag_All\":120,\"iHp_Max\":3520,\"ExpJw\":0,\"iRes_All\":117,\"shenqi_pos\":[0,0,],\"jiyuan\":0,\"AllRider\":{1:{\"ExtraGrow\":0,\"all_skills\":{611:1,},\"iGrade\":125,\"mattrib\":\"敏捷\",\"exgrow\":12824,\"iType\":506,},},\"iExptSki5\":0,\"sum_exp\":42,\"commu_name\":0,\"iTotalMagDef_all\":523,\"iTotalMagDam_all\":572,\"iDod_All\":1107,\"commu_gid\":0,\"iDef_All\":728,\"iMaxExpt4\":20,\"iMarry\":0,\"sword_score\":0,\"cOrg\":\"\",\"farm_level\":0,\"iSmithski\":3,\"iPcktPage\":0,\"iGoodness\":504,\"iMp\":10,}";
        Gson gson = new Gson();
    }

    @Test
    public void testFastjson(){
        String str= "{\"total_horse\":2,\"AllSummon\":[{\"growthMax\":1277,\"sjg\":0,\"lianshou\":0,\"summon_equip1\":{\"cDesc\":\"#r等级 105  #r命中率 +14% 伤害 +36 魔法 +62#r耐久度 524#Y#r#c4DBAF4套装效果：附加状态#c4DBAF4偷袭#Y#Y#r#W制造者：一〃塌糊涂#Y#r#r镶嵌效果 #r+50伤害 镶嵌等级：5\",\"iType\":9311,},\"summon_equip2\":{\"cDesc\":\"#r等级 105  #r伤害 +33 速度 +30#r耐久度 483#Y#r#c4DBAF4套装效果：附加状态#c4DBAF4偷袭#Y#Y#r#W制造者：xm丶鹈鹕#Y#r#r镶嵌效果 #r+6速度 镶嵌等级：1\",\"iType\":9211,},\"jj_extra_add\":0,\"summon_equip3\":{\"cDesc\":\"#r等级 105  #r伤害 +33 防御 +95#r耐久度 634#r#G#G力量 +5#Y#Y#r#c4DBAF4套装效果：附加状态#c4DBAF4偷袭#Y#Y#r#W制造者：Tercel°饕餮#Y#r#r镶嵌效果 #r+90气血 镶嵌等级：3\",\"iType\":9111,},\"csavezz\":\"1508|1321|1451|1460|3969|2661\",\"iGenius\":0,\"iColor\":1,\"MP_MAX\":3050,\"hp\":3969,\"iMagDef_all\":686,\"summon_color\":0,\"HP_MAX\":5500,\"ruyidan\":0,\"summon_equip4_type\":0,\"iGrade\":119,\"all_skills\":{\"316\":1,\"301\":1,\"305\":1,\"304\":1,},\"SPD_MAX\":1550,\"iMp_max\":1263,\"MS_MAX\":1800,\"summon_core\":{907:[5,0,{},],901:[5,0,{},],902:[5,0,{},],904:[5,0,{},],},\"qianjinlu\":0,\"core_close\":0,\"iJjFeedCd\":0,\"left_qlxl\":0,\"iHp_max\":3495,\"jinjie\":{\"core\":{},\"cnt\":7,\"lx\":99,\"new_type\":1,},\"iPoint\":0,\"dod\":1460,\"iBaobao\":1,\"iRealColor\":1,\"tmp_lingxing\":99,\"iCor_all\":362,\"yuanxiao\":0,\"summon_equip4_desc\":\"\",\"iHp\":3495,\"iType\":102710,\"iMag_all\":150,\"grow\":1264,\"mp\":2661,\"iAtt_all\":1761,\"life\":4603,\"att_rate\":14,\"iDod_All\":201,\"def\":1321,\"iDef_All\":679,\"iDex_All\":256,\"iSpe_all\":138,\"DEF_MAX\":1550,\"iAtt_F\":2,\"lastchecksubzz\":2019,\"att\":1508,\"ATK_MAX\":1550,\"iRes_all\":130,\"carrygradezz\":0,\"spe\":1451,\"iMp\":1263,\"iStr_all\":713,},{\"growthMax\":1236,\"sjg\":0,\"lianshou\":0,\"jj_extra_add\":0,\"csavezz\":\"1065|892|1050|1297|3787|1949\",\"iGenius\":0,\"MP_MAX\":3050,\"hp\":3787,\"iMagDef_all\":472,\"summon_color\":0,\"HP_MAX\":5500,\"iGrade\":116,\"all_skills\":{\"306\":1,\"411\":1,\"307\":1,\"403\":1,},\"summon_equip4_type\":0,\"ruyidan\":0,\"SPD_MAX\":1550,\"iMp_max\":891,\"MS_MAX\":1800,\"summon_core\":{910:[5,0,{},],},\"qianjinlu\":0,\"core_close\":0,\"iJjFeedCd\":0,\"left_qlxl\":7,\"iHp_max\":4496,\"jinjie\":{\"core\":{},\"cnt\":0,\"lx\":0,},\"iPoint\":5,\"dod\":1297,\"iBaobao\":0,\"iRealColor\":0,\"tmp_lingxing\":0,\"iCor_all\":581,\"yuanxiao\":0,\"summon_equip4_desc\":\"\",\"iHp\":4496,\"iType\":102071,\"iMag_all\":126,\"grow\":1164,\"mp\":1949,\"iAtt_all\":566,\"life\":4370,\"att_rate\":0,\"iDod_All\":251,\"def\":892,\"iDef_All\":507,\"iDex_All\":203,\"iSpe_all\":194,\"DEF_MAX\":1550,\"iAtt_F\":8,\"lastchecksubzz\":2019,\"att\":1065,\"ATK_MAX\":1550,\"iRes_all\":178,\"carrygradezz\":0,\"spe\":1050,\"iMp\":891,\"iStr_all\":126,},{\"growthMax\":1277,\"sjg\":0,\"lianshou\":0,\"summon_equip1\":{\"cDesc\":\"#r等级 115  #r命中率 +15%#r耐久度 244#r#G#G敏捷 +6#Y #G法力 +7#Y#Y#r#c4DBAF4套装效果：附加状态#c4DBAF4法术暴击#Y#Y#r#W制造者：偶然遇见你#Y\",\"iType\":9312,},\"summon_equip2\":{\"cDesc\":\"#r等级 115  #r速度 +38#r耐久度 308#r#G#G灵力 +7#Y #G法力 +6#Y#Y#r#c4DBAF4套装效果：附加状态#c4DBAF4法术暴击#Y#Y#r#W制造者：偶然遇见你#Y#r#r镶嵌效果 #r+6速度 镶嵌等级：1\",\"iType\":9212,},\"jj_extra_add\":0,\"summon_equip3\":{\"cDesc\":\"#r等级 115  #r防御 +110#r耐久度 236#r#G#G灵力 +12#Y#Y#r#c4DBAF4套装效果：附加状态#c4DBAF4法术暴击#Y#Y#r#W制造者：旋叶风#Y#r#r镶嵌效果 #r+30气血 镶嵌等级：1\",\"iType\":9112,},\"csavezz\":\"965|1025|1210|927|4737|2723\",\"iGenius\":429,\"MP_MAX\":3050,\"hp\":4737,\"iMagDef_all\":933,\"summon_color\":0,\"HP_MAX\":5500,\"ruyidan\":0,\"summon_equip4_type\":0,\"iGrade\":115,\"all_skills\":{\"424\":1,\"412\":1,\"309\":1,\"429\":1,\"661\":1,},\"SPD_MAX\":1550,\"iMp_max\":3958,\"MS_MAX\":1800,\"summon_core\":{931:[5,0,{},],905:[5,0,{},],906:[5,0,{},],904:[5,0,{},],},\"qianjinlu\":0,\"core_close\":0,\"iJjFeedCd\":0,\"left_qlxl\":0,\"iHp_max\":1770,\"jinjie\":{\"core\":{},\"cnt\":7,\"lx\":99,\"new_type\":1,},\"iPoint\":0,\"dod\":927,\"iBaobao\":1,\"iRealColor\":0,\"tmp_lingxing\":99,\"iCor_all\":148,\"yuanxiao\":0,\"summon_equip4_desc\":\"\",\"iHp\":1770,\"iType\":102211,\"iMag_all\":893,\"grow\":1244,\"mp\":2723,\"iAtt_all\":574,\"life\":899,\"att_rate\":15,\"iDod_All\":135,\"def\":1025,\"iDef_All\":597,\"iDex_All\":220,\"iSpe_all\":146,\"DEF_MAX\":1550,\"iAtt_F\":1,\"lastchecksubzz\":2019,\"att\":965,\"ATK_MAX\":1550,\"iRes_all\":130,\"carrygradezz\":0,\"spe\":1210,\"iMp\":3196,\"iStr_all\":150,},],\"iDesc\":0,\"shenqi_yellow\":\"0神器灵气：50#r\",\"rent_level\":0,\"iPride\":800,\"iNutsNum\":100,\"usernum\":9893195,\"iExptSki3\":17,\"iCGTotalAmount\":0,\"iBeastSki2\":2,\"ExpJwBase\":1000000000,\"iIcon\":5,\"iZhuanZhi\":0,\"iSchOffer\":170,\"iDamage_All\":953,\"iRace\":2,\"iCGBodyAmount\":0,\"iGrade\":109,\"TA_iAllPoint\":0,\"changesch\":[9,],\"iErrantry\":0,\"ExAvt\":{1:{\"cName\":\"夜影\",\"order\":1,\"iType\":12067,},3:{\"cName\":\"光剑足迹\",\"order\":6,\"iType\":14533,},7:{\"cName\":\"腾蛇炫卡\",\"order\":2,\"iType\":13112,},5:{\"cName\":\"蛮鬼铁盾\",\"order\":5,\"iType\":13993,},4:{\"cName\":\"夜影\",\"order\":4,\"iType\":13313,},6:{\"cName\":\"怀旧巨魔王炫卡\",\"order\":7,\"iType\":19287,},2:{\"cName\":\"动物装饰篮\",\"order\":3,\"iType\":14401,},},\"TA_iAllNewPoint\":3,\"ori_desc\":3072,\"iStr_All\":120,\"iMaxExpt3\":20,\"iPoint\":0,\"shenqi\":{\"attributes\":[{\"id\":1,\"disable\":0,\"attr\":\"速度 +4.5\",},{\"id\":2,\"disable\":1,\"attr\":\"气血 +0\",},{\"id\":8,\"disable\":0,\"attr\":\"伤害 +3\",},{\"id\":16,\"disable\":1,\"attr\":\"法术防御 +0\",},{\"id\":4,\"disable\":0,\"attr\":\"抵抗封印 +6\",},],\"full\":0,\"id\":6208,\"active\":1,\"power\":220,\"skill_desc\":\"被你的物理伤害攻击的单位在当回合内的法术伤害结果减少74点。\",\"skill_level\":1,\"skill\":53112,\"components\":[{\"wuxing\":[{\"wuxingshi_affix\":0,\"id\":1,\"wuxingshi_level\":1,\"affix_disable\":0,\"status\":0,\"attr\":\"速度 +2.2\",},{\"wuxingshi_affix\":0,\"id\":4,\"wuxingshi_level\":1,\"affix_disable\":0,\"status\":0,\"attr\":\"抵抗封印 +6\",},{\"wuxingshi_affix\":0,\"id\":8,\"wuxingshi_level\":1,\"affix_disable\":0,\"status\":0,\"attr\":\"伤害 +3\",},{\"wuxingshi_affix\":0,\"id\":1,\"wuxingshi_level\":1,\"affix_disable\":0,\"status\":0,\"attr\":\"速度 +2.2\",},],\"unlock\":1,\"level\":1,},{\"wuxing\":[{\"wuxingshi_affix\":0,\"id\":1,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"速度 +0\",},{\"wuxingshi_affix\":0,\"id\":1,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"速度 +0\",},{\"wuxingshi_affix\":0,\"id\":4,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"抵抗封印 +0\",},{\"wuxingshi_affix\":0,\"id\":4,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"抵抗封印 +0\",},],\"unlock\":0,\"level\":0,},{\"wuxing\":[{\"wuxingshi_affix\":0,\"id\":8,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"伤害 +0\",},{\"wuxingshi_affix\":0,\"id\":4,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"抵抗封印 +0\",},{\"wuxingshi_affix\":0,\"id\":4,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"抵抗封印 +0\",},{\"wuxingshi_affix\":0,\"id\":8,\"wuxingshi_level\":0,\"affix_disable\":0,\"status\":0,\"attr\":\"伤害 +0\",},],\"unlock\":0,\"level\":0,},],},\"iMagDef_All\":467,\"iMaxExpt2\":20,\"iCash\":65098,\"iExptSki1\":0,\"iSpe_All\":855,\"iMaxExpt1\":20,\"propKept\":{0:{\"iSpe\":174,\"iRes\":118,\"iCor\":123,\"iMag\":122,\"iStr\":698,},},\"i3FlyLv\":0,\"iBeastSki4\":1,\"AchPointTotal\":1560,\"iHp\":2485,\"energy\":83,\"iSumAmountEx\":0,\"iSchool\":11,\"iMp_Max\":762,\"bid\":0,\"AllEquip\":{189:{\"cDesc\":\"等级 100#r抵抗封印等级 +20#r耐久度 181#r精炼等级 1#r#G气血 +81 #cEE82EE[+28]#r#G抗物理暴击等级 +20 #cEE82EE[+8]#r#W制造者：＂乌贼＃强化打造#\",\"iType\":27203,},13:{\"cDesc\":\"#r等级 70  五行 火#r#r伤害 +148 命中 +184#r耐久度 450#Y  \",\"iType\":2408,},12:{\"cDesc\":\"#r等级 50  #r灵力 +86#r耐久度 258#r锻炼等级 3  镶嵌宝石 舍利子#Y#r#c4DBAF4特效：#c4DBAF4专注#Y#r#G开运孔数：1孔/2孔#Y #r#W制造者：挽梦#Y  \",\"iType\":2809,},9:{\"cDesc\":\"#W等级 60#W#r#Y未鉴定物品#Y  \",\"iType\":2107,},187:{\"cDesc\":\"等级 100#r伤害 +21#r耐久度 178#r精炼等级 2#r#G固定伤害 +10 #cEE82EE[+8]#r#G伤害 +10 #cEE82EE[+8]#r#W制造者：北城念梦强化打造#\",\"iType\":27003,},188:{\"cDesc\":\"等级 100#r法术防御 +21#r耐久度 179#r精炼等级 2#r#G固定伤害 +15 #cEE82EE[+8]#r#G封印命中等级 +10 #cEE82EE[+8]#r#G物理暴击等级 +10 #cEE82EE[+8]#r#W制造者：＂乌贼＃强化打造#\",\"iType\":27103,},2:{\"cDesc\":\"#r等级 100  五行 土#r#r气血 +120 防御 +168#r耐久度 382#r锻炼等级 3  镶嵌宝石 光芒石#r#G#G敏捷 +13#Y#Y#r#W制造者：中国品牌时代强化打造#Y  \",\"iType\":2652,},6:{\"cDesc\":\"#r等级 100  五行 水#r#r伤害 +384 命中 +415#r耐久度 415#r锻炼等级 5  镶嵌宝石 太阳石#r#G#G敏捷 +32#Y#Y#r#G开运孔数：1孔/4孔#Y #r#W制造者：神威·制造师强化打造#Y  \",\"iType\":1152,},1:{\"cDesc\":\"#r等级 100  五行 木#r#r魔法 +115 防御 +67#r耐久度 382  修理失败 1次#r锻炼等级 1  镶嵌宝石 月亮石#Y#r#G开运孔数：1孔/4孔#Y #r#W制造者：ㄣ四道封︵ミ#Y  \",\"iType\":2552,},3:{\"cDesc\":\"#r等级 100  五行 火#r#r敏捷 +36 防御 +57#r耐久度 186#Y#r#W制造者：客官一在这里强化打造#Y  \",\"iType\":2752,},10:{\"cDesc\":\"#r等级 60  五行 土#r#r防御 +80#r耐久度 400#r#G#G体质 +9#Y#Y#r#c4DBAF4套装效果：附加状态定心术#Y#Y  \",\"iType\":2616,},190:{\"cDesc\":\"等级 80#r速度 +14#r耐久度 263#r精炼等级 2#r#G抗法术暴击等级 +19 #cEE82EE[+16]#r#G气血 +56 #cEE82EE[+56]#r#G法术防御 +19 #cEE82EE[+16]#r#W制造者：0000财神000O强化打造#\",\"iType\":27302,},8:{\"cDesc\":\"#r等级 95  #r防御 +79#r耐久度 500#Y#r#c4DBAF4套装效果：附加状态#c4DBAF4高级反击#Y#Y#r#W制造者：☆杀☆神☆#Y  \",\"iType\":9110,},5:{\"cDesc\":\"#r等级 100  五行 金#r#r气血 +450 防御 +57#r耐久度 7  修理失败 3次#r锻炼等级 5  镶嵌宝石 光芒石#Y#r#G开运孔数：4孔/4孔#Y #r#W制造者：秀秀秀逗强化打造#Y#r#Y熔炼效果：#r#Y#r-1防御 +14气血 #r#Y  \",\"iType\":2952,},4:{\"cDesc\":\"#r等级 100  #r灵力 +155#r耐久度 465#r锻炼等级 4  镶嵌宝石 舍利子#Y#r#G开运孔数：4孔/4孔#Y #r#W制造者：御剑为红颜が强化打造#Y  \",\"iType\":2852,},},\"iSewski\":0,\"addPoint\":7,\"iDex_All\":648,\"outdoor_level\":0,\"iHp_Eff\":2610,\"ori_race\":2,\"iAtt_All\":721,\"datang_feat\":5950,\"iExptSki4\":15,\"iSaving\":0,\"fabao\":{1:{\"cDesc\":\"0#Y灵气：#G12 #Y 五行：#G金#Y#r修炼境界：第#G6#Y层 #cA6F101降龙伏虎#Y\",\"iType\":6003,},12:{\"cDesc\":\"0#W【回合限制】3#r#Y#Y灵气：#G300#Y 五行：#G火#Y#r修炼境界：第#G12#Y层 #cFF6F28法力无边#Y\",\"iType\":6052,},11:{\"cDesc\":\"0#Y灵气：#G275#Y 五行：#G水#Y#r修炼境界：第#G12#Y层 #cFF6F28笑傲西游#Y#r传送至北俱芦洲（36，150）\",\"iType\":6020,},},\"igoodness_sav\":76,\"iCor_All\":121,\"more_attr\":{\"attrs\":[{\"lv\":0,\"idx\":4,},{\"lv\":35,\"idx\":10,},{\"lv\":20,\"idx\":2,},{\"lv\":28,\"idx\":9,},{\"lv\":0,\"idx\":12,},{\"lv\":18,\"idx\":1,},{\"lv\":0,\"idx\":3,},{\"lv\":18,\"idx\":6,},{\"lv\":0,\"idx\":8,},{\"lv\":0,\"idx\":7,},{\"lv\":0,\"idx\":11,},{\"lv\":0,\"idx\":5,},{\"lv\":1107,\"idx\":13,},{\"lv\":467,\"idx\":14,},],},\"icolor_ex\":0,\"iSkiPoint\":3,\"normal_horse\":2,\"pet\":[],\"HugeHorse\":{58:{\"iSkillLevel\":0,\"cName\":\"穿云飞辇\",\"iSkill\":0,\"nosale\":0,\"iType\":11058,\"order\":2,},113:{\"iSkillLevel\":0,\"cName\":\"流云玉佩\",\"iSkill\":0,\"nosale\":0,\"iType\":11098,\"order\":1,},},\"iExptSki2\":14,\"iCGBoxAmount\":0,\"HeroScore\":64,\"iBeastSki3\":4,\"iBadness\":0,\"all_skills\":{\"86\":94,\"208\":32,\"198\":1,\"179\":1,\"30808\":1,\"170\":1,\"84\":119,\"212\":2,\"159\":1,\"30805\":1,\"52016\":1,\"87\":119,\"197\":1,\"169\":1,\"52032\":1,\"30806\":1,\"85\":119,\"173\":1,\"174\":1,\"89\":119,\"88\":119,\"206\":92,\"211\":2,\"202\":54,\"160\":5,\"230\":11,\"52031\":1,\"90\":85,\"30801\":1,\"196\":1,\"154\":6,\"201\":96,\"204\":36,},\"total_avatar\":7,\"iBeastSki1\":5,\"iOrgOffer\":0,\"rent\":0,\"iSumAmount\":8,\"xianyu\":400,\"iUpExp\":925970244,\"cName\":\"′封王．n1ce\",\"iMarry2\":0,\"iLearnCash\":1388646,\"idbid_desc\":[],\"iMag_All\":120,\"iHp_Max\":3520,\"ExpJw\":0,\"iRes_All\":117,\"shenqi_pos\":[0,0,],\"jiyuan\":0,\"AllRider\":{1:{\"ExtraGrow\":0,\"all_skills\":{611:1,},\"iGrade\":125,\"mattrib\":\"敏捷\",\"exgrow\":12824,\"iType\":506,},},\"iExptSki5\":0,\"sum_exp\":42,\"commu_name\":0,\"iTotalMagDef_all\":523,\"iTotalMagDam_all\":572,\"iDod_All\":1107,\"commu_gid\":0,\"iDef_All\":728,\"iMaxExpt4\":20,\"iMarry\":0,\"sword_score\":0,\"cOrg\":\"\",\"farm_level\":0,\"iSmithski\":3,\"iPcktPage\":0,\"iGoodness\":504,\"iMp\":10,}";
        JSONObject json = JSONObject.parseObject(str);
        System.out.println(json);
    }
}
