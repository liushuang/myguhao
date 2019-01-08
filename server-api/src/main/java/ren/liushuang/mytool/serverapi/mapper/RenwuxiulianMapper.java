package ren.liushuang.mytool.serverapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import ren.liushuang.mytool.serverapi.entity.RenwuxiulianEntity;
import ren.liushuang.mytool.serverapi.entity.ShimenjinengEntity;

@Mapper
public interface RenwuxiulianMapper {

    @Insert("insert into renwuxiulian(level, xiulian_exp, type, coin, coin_total) values(#{level}, #{xiulianExp}, #{type}, #{coin}, #{coinTotal})")
    int insert(RenwuxiulianEntity renwuxiulianEntity);

    @Select("select level, xiulian_exp as xiulianExp, type, coin, coin_total as coinTotal from renwuxiulian")
    List<RenwuxiulianEntity> listAll();
}
