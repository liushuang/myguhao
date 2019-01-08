package ren.liushuang.mytool.serverapi.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.common.base.Splitter;

import ren.liushuang.mytool.serverapi.entity.BangpaijinengEntity;
import ren.liushuang.mytool.serverapi.entity.JinengType;
import ren.liushuang.mytool.serverapi.entity.ShimenjinengEntity;
import ren.liushuang.mytool.serverapi.mapper.BangpaijinengMapper;
import ren.liushuang.mytool.serverapi.mapper.ShimenjinengMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BangpaijinengGenerate {

    @Autowired
    private BangpaijinengMapper bangpaijinengMapper;

    @Test
    public void generateQiangzhuang() {
        File file = new File(getClass().getResource("/qiangzhuang.resource").getFile());
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int coin;
            int coinTotal =0;
            int exp;
            int expTotal =0;
            int banggongTotal=0;
            int level;
            while ((tempString = reader.readLine()) != null) {
                Iterator<String> iterator = Splitter.on(" ").split(tempString).iterator();
                level = Integer.valueOf(iterator.next());
                iterator.next();
                exp = Integer.valueOf(iterator.next());
                coin = Integer.valueOf(iterator.next());
                coinTotal += coin;
                expTotal += exp;
                banggongTotal +=level;

                BangpaijinengEntity bangpaijinengEntity = BangpaijinengEntity.builder()
                                                                             .level(level)
                                                                             .exp(exp)
                                                                             .expTotal(expTotal)
                                                                             .coin(coin)
                                                                             .coinTotal(coinTotal)
                                                                             .banggongTotal(banggongTotal)
                                                                             .type(JinengType.QIANGZHUANG)
                                                                             .build();
                bangpaijinengMapper.insert(bangpaijinengEntity);
            }
            reader.close();
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
    public void generateNormal() {
        File file = new File(getClass().getResource("/bangpai_normal.resource").getFile());
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int coin;
            int coinTotal =0;
            int exp;
            int expTotal =0;
            int banggongTotal=0;
            int level;
            while ((tempString = reader.readLine()) != null) {
                Iterator<String> iterator = Splitter.on("\t").split(tempString).iterator();
                level = Integer.valueOf(iterator.next());
                exp = Integer.valueOf(iterator.next());
                coin = Integer.valueOf(iterator.next());
                coinTotal += coin;
                expTotal += exp;
                banggongTotal +=level;

                BangpaijinengEntity bangpaijinengEntity = BangpaijinengEntity.builder()
                                                                             .level(level)
                                                                             .exp(exp)
                                                                             .expTotal(expTotal)
                                                                             .coin(coin)
                                                                             .coinTotal(coinTotal)
                                                                             .banggongTotal(banggongTotal)
                                                                             .type(JinengType.NORMAL)
                                                                             .build();
                bangpaijinengMapper.insert(bangpaijinengEntity);
            }
            reader.close();
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
