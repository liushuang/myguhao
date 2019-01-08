package ren.liushuang.mytool.serverapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import ren.liushuang.mytool.serverapi.entity.ShimenjinengEntity;

@Mapper
public interface ShimenjinengMapper {

    @Insert("insert into shimenjineng(level, coin, coin_total, exp, exp_total) values(#{level}, #{coin}, #{coinTotal}, #{exp}, #{expTotal})")
    int insert(ShimenjinengEntity shimenjineng);

    @Select("select level, coin, coin_total as coinTotal, exp, exp_total as expTotal from shimenjineng")
    List<ShimenjinengEntity> listAll();
}
