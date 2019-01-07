package ren.liushuang.mytool.serverapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChongwuxiulianEntity {
    private int level;
    private int jifen;
    private int jifenTotal;
    private int extraCoin;
    private int coinTotal;
}
