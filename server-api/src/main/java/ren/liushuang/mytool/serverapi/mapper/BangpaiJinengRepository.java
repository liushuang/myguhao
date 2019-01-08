package ren.liushuang.mytool.serverapi.mapper;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;

import ren.liushuang.mytool.serverapi.entity.BangpaijinengEntity;
import ren.liushuang.mytool.serverapi.entity.JinengType;

@Repository
public class BangpaiJinengRepository {

    @Autowired
    private BangpaijinengMapper bangpaijinengMapper;

    private Map<String, BangpaijinengEntity> data = Maps.newHashMap();

    private Map<Integer, String> idToName = Maps.newHashMap();

    @PostConstruct
    public void init() {
        List<BangpaijinengEntity> bangpaijinengEntities = bangpaijinengMapper.listAll();
        for (BangpaijinengEntity bangpaijinengEntity : bangpaijinengEntities) {
            data.put(getKey(bangpaijinengEntity.getLevel(),bangpaijinengEntity.getType()), bangpaijinengEntity);
        }

        JSONObject json = JSONObject.parseObject(
                "{201:\"强身术\",202:\"冥想\",203:\"暗器技巧\",204:\"打造技巧\",205:\"裁缝技巧\",206:\"中药医理\",207:\"炼金术\",208:\"烹饪技巧\",209:\"追捕技巧\",210:\"逃离技巧\",211:\"养生之道\",212:\"健身术\",216:\"巧匠之术\",217:\"熔炼技巧\",218:\"灵石技巧\",230:\"强壮\",231:\"淬灵之术\",237:\"神速\"}");
        for (Entry<?, Object> entry : json.entrySet()) {
            idToName.put(Integer.valueOf(entry.getKey().toString()), entry.getValue().toString());
        }
    }

    private String getKey(int level, JinengType type){
        return level + "_" + type.name();
    }

    public BangpaijinengEntity getBangpaiJineng(int level, JinengType type) {
        return data.get(getKey(level, type));
    }

    public Set<Integer> getBangpaiJinengIdSet(){
        return idToName.keySet();
    }

    public String getName(int id) {
        return idToName.get(id);
    }
}
