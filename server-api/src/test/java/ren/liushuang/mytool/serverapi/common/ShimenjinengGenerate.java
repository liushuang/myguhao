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

import ren.liushuang.mytool.serverapi.entity.ShimenjinengEntity;
import ren.liushuang.mytool.serverapi.mapper.ShimenjinengMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShimenjinengGenerate {

    @Autowired
    private ShimenjinengMapper shimenjinengMapper;

    @Test
    public void generate() {
        File file = new File(getClass().getResource("/shimenjineng.resource").getFile());
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int coin;
            int totalCoin = 0;
            int exp;
            int totalExp = 0;
            int level;
            while ((tempString = reader.readLine()) != null) {
                Iterator<String> iterator = Splitter.on("\t").split(tempString).iterator();
                level = Integer.valueOf(iterator.next());
                exp = Integer.valueOf(iterator.next());
                coin = Integer.valueOf(iterator.next());
                totalCoin += coin;
                totalExp += exp;
                ShimenjinengEntity shimenjinengEntity = ShimenjinengEntity.builder().level(level).exp(exp)
                                                                          .expTotal(totalExp).coin(coin)
                                                                          .coinTotal(totalCoin).build();
                shimenjinengMapper.insert(shimenjinengEntity);
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
