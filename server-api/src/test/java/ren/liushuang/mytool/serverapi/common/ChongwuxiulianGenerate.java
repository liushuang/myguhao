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

import ren.liushuang.mytool.serverapi.entity.ChongwuxiulianEntity;
import ren.liushuang.mytool.serverapi.entity.ShimenjinengEntity;
import ren.liushuang.mytool.serverapi.mapper.ChongwuxiulianMapper;
import ren.liushuang.mytool.serverapi.mapper.ShimenjinengMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChongwuxiulianGenerate {

    @Autowired
    private ChongwuxiulianMapper chongwuxiulianMapper;

    // 72W/150 point
    private static final int JIFEN_COIN_EXCHANGE = 720000 / 150;

    @Test
    public void generate() {
        File file = new File(getClass().getResource("/chongwuxiulian.resource").getFile());
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int coinTotal = 0;
            int jifen;
            int jifenTotal = 0;
            int extraCoin;
            int level;
            while ((tempString = reader.readLine()) != null) {
                Iterator<String> iterator = Splitter.on("\t").split(tempString).iterator();
                level = Integer.valueOf(iterator.next());
                jifen = Integer.valueOf(iterator.next());
                extraCoin = Integer.valueOf(iterator.next());
                coinTotal = coinTotal + jifen * JIFEN_COIN_EXCHANGE + extraCoin;
                jifenTotal += jifen;
                ChongwuxiulianEntity chongwuxiulianEntity = ChongwuxiulianEntity.builder()
                                                                                .jifen(jifen)
                                                                                .jifenTotal(jifenTotal)
                                                                                .extraCoin(extraCoin)
                                                                                .coinTotal(coinTotal)
                                                                                .level(level)
                                                                                .build();
                chongwuxiulianMapper.insert(chongwuxiulianEntity);
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
