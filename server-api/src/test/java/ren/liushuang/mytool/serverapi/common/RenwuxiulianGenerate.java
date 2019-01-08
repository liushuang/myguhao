package ren.liushuang.mytool.serverapi.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import ren.liushuang.mytool.serverapi.entity.RenwuxiulianEntity;
import ren.liushuang.mytool.serverapi.entity.ShimenjinengEntity;
import ren.liushuang.mytool.serverapi.entity.XiulianType;
import ren.liushuang.mytool.serverapi.mapper.RenwuxiulianMapper;
import ren.liushuang.mytool.serverapi.mapper.ShimenjinengMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RenwuxiulianGenerate {

    @Autowired
    private RenwuxiulianMapper renwuxiulianMapper;

    @Test
    public void generate() {
        File file = new File(getClass().getResource("/renwuxiulian.resource").getFile());
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int coin;
            int coinTotal = 0;
            int exp;
            int level;
            List<RenwuxiulianEntity> gongjiList = Lists.newArrayList();
            List<RenwuxiulianEntity> fangyuList = Lists.newArrayList();
            while ((tempString = reader.readLine()) != null) {
                Iterator<String> iterator = Splitter.on("\t").split(tempString).iterator();
                level = Integer.valueOf(iterator.next());
                exp = Integer.valueOf(iterator.next());
                coin = Integer.valueOf(iterator.next()) * 10000;
                coinTotal = Integer.valueOf(iterator.next()) * 10000;
                RenwuxiulianEntity renwuxiulianFangyu = RenwuxiulianEntity.builder()
                                                                          .level(level)
                                                                          .xiulianExp(exp)
                                                                          .coin(coin)
                                                                          .coinTotal(coinTotal)
                                                                          .type(XiulianType.FANGYU)
                                                                          .build();

                fangyuList.add(renwuxiulianFangyu);
                RenwuxiulianEntity renwuxiulianGongji = RenwuxiulianEntity.builder()
                                                                          .level(level)
                                                                          .xiulianExp(exp)
                                                                          .coin(Integer.valueOf(iterator.next())
                                                                                * 10000)
                                                                          .coinTotal(Integer.valueOf(
                                                                                  iterator.next()) * 10000)
                                                                          .type(XiulianType.GONGJI)
                                                                          .build();
                gongjiList.add(renwuxiulianGongji);
            }
            reader.close();
            gongjiList.forEach(g -> renwuxiulianMapper.insert(g));
            fangyuList.forEach(f -> renwuxiulianMapper.insert(f));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }


    @Test
    public void generateMax() {
        File file = new File(getClass().getResource("/renwuxiulian_max.resource").getFile());
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int level;
            int gongjiCoin;
            int fangyuCoin;
            List<RenwuxiulianEntity> gongjiList = Lists.newArrayList();
            List<RenwuxiulianEntity> fangyuList = Lists.newArrayList();
            while ((tempString = reader.readLine()) != null) {
                Iterator<String> iterator = Splitter.on("\t").split(tempString).iterator();
                level = Integer.valueOf(iterator.next());
                iterator.next();
                gongjiCoin = Integer.valueOf(iterator.next());
                fangyuCoin = Integer.valueOf(iterator.next());
                RenwuxiulianEntity renwuxiulianFangyu = RenwuxiulianEntity.builder()
                                                                          .level(level)
                                                                          .xiulianExp(0)
                                                                          .coin(fangyuCoin)
                                                                          .coinTotal(fangyuCoin)
                                                                          .type(XiulianType.FANGYU_MAX)
                                                                          .build();

                fangyuList.add(renwuxiulianFangyu);
                RenwuxiulianEntity renwuxiulianGongji = RenwuxiulianEntity.builder()
                                                                          .level(level)
                                                                          .xiulianExp(0)
                                                                          .coin(gongjiCoin)
                                                                          .coinTotal(gongjiCoin)
                                                                          .type(XiulianType.GONGJI_MAX)
                                                                          .build();
                gongjiList.add(renwuxiulianGongji);
            }
            reader.close();
            gongjiList.forEach(g -> renwuxiulianMapper.insert(g));
            fangyuList.forEach(f -> renwuxiulianMapper.insert(f));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }
}
