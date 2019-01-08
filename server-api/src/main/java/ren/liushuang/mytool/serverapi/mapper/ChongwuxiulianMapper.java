package ren.liushuang.mytool.serverapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import ren.liushuang.mytool.serverapi.entity.ChongwuxiulianEntity;
import ren.liushuang.mytool.serverapi.entity.ShimenjinengEntity;

@Mapper
public interface ChongwuxiulianMapper {

    @Insert("insert into chongwuxiulian(level, jifen, jifen_total, extra_coin_total, coin_total) values(#{level}, #{jifen}, #{jifenTotal}, #{extraCoinTotal}, #{coinTotal})")
    int insert(ChongwuxiulianEntity chongwuxiulian);

    @Select("select level, jifen, jifen_total as jifenTotal, extra_coin_total as extraCoinTotal, coin_total as coinTotal from chongwuxiulian")
    List<ChongwuxiulianEntity> listAll();
}
