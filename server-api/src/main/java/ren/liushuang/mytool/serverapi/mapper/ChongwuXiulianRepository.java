package ren.liushuang.mytool.serverapi.mapper;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.common.collect.Maps;

import ren.liushuang.mytool.serverapi.entity.ChongwuxiulianEntity;

@Repository
public class ChongwuXiulianRepository {
    @Autowired
    private ChongwuxiulianMapper chongwuxiulianMapper;

    private Map<Integer, ChongwuxiulianEntity> data = Maps.newHashMap();

    @PostConstruct
    public void init() {
        chongwuxiulianMapper.listAll().forEach(e -> data.put(e.getLevel(), e));
    }

    public ChongwuxiulianEntity getChongwuXiulianEntity(int level) {
        return data.get(level);
    }
}
