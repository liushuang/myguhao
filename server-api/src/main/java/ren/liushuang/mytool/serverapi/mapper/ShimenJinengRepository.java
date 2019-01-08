package ren.liushuang.mytool.serverapi.mapper;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.common.collect.Maps;

import ren.liushuang.mytool.serverapi.entity.ShimenjinengEntity;

@Repository
public class ShimenJinengRepository {
    @Autowired
    private ShimenjinengMapper shimenjinengMapper;

    private Map<Integer, ShimenjinengEntity> data = Maps.newHashMap();

    @PostConstruct
    public void init() {
        shimenjinengMapper.listAll().forEach(s -> data.put(s.getLevel(), s));
    }

    public ShimenjinengEntity getShimenJinengEntity(int level) {
        return data.get(level);
    }
}
