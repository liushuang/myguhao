package ren.liushuang.mytool.serverapi.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import ren.liushuang.mytool.serverapi.entity.ChongwuxiulianEntity;
import ren.liushuang.mytool.serverapi.entity.ShimenjinengEntity;

@Mapper
public interface ChongwuxiulianMapper {

    @Insert("insert into chongwuxiulian(level, jifen, jifen_total, extra_coin, coin_total) values(#{level}, #{jifen}, #{jifenTotal}, #{extraCoin}, #{coinTotal})")
    int insert(ChongwuxiulianEntity chongwuxiulian);
}
