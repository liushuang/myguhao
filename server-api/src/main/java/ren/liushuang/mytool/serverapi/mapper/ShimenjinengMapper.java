package ren.liushuang.mytool.serverapi.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import ren.liushuang.mytool.serverapi.entity.ShimenjinengEntity;

@Mapper
public interface ShimenjinengMapper {

    @Insert("insert into shimenjineng(level, coin, coin_total, exp, exp_total) values(#{level}, #{coin}, #{coinTotal}, #{exp}, #{expTotal})")
    int insert(ShimenjinengEntity shimenjineng);
}
