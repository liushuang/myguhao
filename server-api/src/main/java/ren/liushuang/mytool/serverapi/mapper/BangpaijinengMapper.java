package ren.liushuang.mytool.serverapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import ren.liushuang.mytool.serverapi.entity.BangpaijinengEntity;

@Mapper
public interface BangpaijinengMapper {

    @Insert("insert into bangpaijineng(level, exp, exp_total, coin, coin_total, banggong_total, type) "
            + "values(#{level}, #{exp}, #{expTotal}, #{coin}, #{coinTotal}, #{banggongTotal}, #{type})")
    int insert(BangpaijinengEntity bangpaijinengEntity);

    @Select("select level, exp, exp_total as expTotal, coin, coin_total as coinTotal, banggong_total as banggongTotal, type from bangpaijineng")
    List<BangpaijinengEntity> listAll();
}
