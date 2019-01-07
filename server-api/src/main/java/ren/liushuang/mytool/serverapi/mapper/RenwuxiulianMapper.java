package ren.liushuang.mytool.serverapi.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import ren.liushuang.mytool.serverapi.entity.RenwuxiulianEntity;
import ren.liushuang.mytool.serverapi.entity.ShimenjinengEntity;

@Mapper
public interface RenwuxiulianMapper {

    @Insert("insert into renwuxiulian(level, xiulian_exp, type, coin, coin_total) values(#{level}, #{xiulianExp}, #{type}, #{coin}, #{coinTotal})")
    int insert(RenwuxiulianEntity renwuxiulianEntity);
}
