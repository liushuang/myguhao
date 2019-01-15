package ren.liushuang.mytool.serverapi.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import ren.liushuang.mytool.serverapi.model.equip.Equip;

@Mapper
public interface EquipMapper {

    @Insert("insert into equip(qixue,max_expt_fashu,lingli,all_damage,speed,max_expt_fangyu,addon_minjie,server_name,init_hp,init_defense,bb_expt_gongji,equip_count,area_name,expt_kangfa,max_expt_gongji,magic_damage,minjie,suit_skill,school,zongshang,level,fangyu,equip_name,magic_defense,server_sn,selling_time,xiang_qian_level,equip_level_desc,mingzhong,init_wakan,equipid,anti_fengyin,bb_expt_fashu,bb_expt_kangfa,init_damage,shanghai,expt_gongji,expt_fangyu,max_expt_kangfa,addon_total,mofa,jinglian_level,price_int,gem_level,addon_skill_chance,storage_type,expt_fashu,collect_num,server_id,score,bb_expt_fangyu,addon_effect_chance,kindid,addon_naili,hp,unit_price_desc,init_dex,game_ordersn,fengyin,defense,eid,addon_fali,addon_status,tag,addon_lingli,addon_tizhi,init_damage_raw,damage,suit_effect,special_skill,equip_level,addon_liliang,status,equip_type,price,other_info,serverid,icon,special_effect,gem_value, `desc`) values" +
            "(#{qixue},#{max_expt_fashu},#{lingli},#{all_damage},#{speed},#{max_expt_fangyu},#{addon_minjie},#{server_name},#{init_hp},#{init_defense},#{bb_expt_gongji},#{equip_count},#{area_name},#{expt_kangfa},#{max_expt_gongji},#{magic_damage},#{minjie},#{suit_skill},#{school},#{zongshang},#{level},#{fangyu},#{equip_name},#{magic_defense},#{server_sn},#{selling_time},#{xiang_qian_level},#{equip_level_desc},#{mingzhong},#{init_wakan},#{equipid},#{anti_fengyin},#{bb_expt_fashu},#{bb_expt_kangfa},#{init_damage},#{shanghai},#{expt_gongji},#{expt_fangyu},#{max_expt_kangfa},#{addon_total},#{mofa},#{jinglian_level},#{price_int},#{gem_level},#{addon_skill_chance},#{storage_type},#{expt_fashu},#{collect_num},#{server_id},#{score},#{bb_expt_fangyu},#{addon_effect_chance},#{kindid},#{addon_naili},#{hp},#{unit_price_desc},#{init_dex},#{game_ordersn},#{fengyin},#{defense},#{eid},#{addon_fali},#{addon_status},#{tag},#{addon_lingli},#{addon_tizhi},#{init_damage_raw},#{damage},#{suit_effect},#{special_skill},#{equip_level},#{addon_liliang},#{status},#{equip_type},#{price},#{other_info},#{serverid},#{icon},#{special_effect},#{gem_value},#{desc})")
    int insert(Equip equip);

}
