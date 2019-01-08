package ren.liushuang.mytool.serverapi.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import ren.liushuang.mytool.serverapi.entity.BangpaijinengEntity;

@Mapper
public interface BangpaijinengMapper {

    @Insert("insert into bangpaijineng(level, exp, exp_total, coin, coin_total, banggong_total, type) "
            + "values(#{level}, #{exp}, #{expTotal}, #{coin}, #{coinTotal}, #{banggongTotal}, #{type})")
    int insert(BangpaijinengEntity bangpaijinengEntity);
}
