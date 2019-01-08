package ren.liushuang.mytool.serverapi.mapper;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.common.collect.Maps;

import ren.liushuang.mytool.serverapi.entity.RenwuxiulianEntity;
import ren.liushuang.mytool.serverapi.entity.XiulianType;

@Repository
public class RenwuXiulianRepository {
    @Autowired
    private RenwuxiulianMapper renwuxiulianMapper;

    private Map<String, RenwuxiulianEntity> data = Maps.newHashMap();

    @PostConstruct
    private void init() {
        List<RenwuxiulianEntity> list = renwuxiulianMapper.listAll();
        list.forEach(e -> data.put(buildKey(e.getLevel(), e.getType()), e));
    }

    private String buildKey(int level, XiulianType type) {
        return level + "_" + type.name();
    }

    public RenwuxiulianEntity getRenwuXiulian(int level, XiulianType xiulianType) {
        return data.get(buildKey(level, xiulianType));
    }
}
