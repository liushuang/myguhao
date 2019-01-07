package ren.liushuang.mytool.serverapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RenwuxiulianEntity {
    private int level;
    private int xiulianExp;
    private XiulianType type;
    private int coin;
    private int coinTotal;
}
