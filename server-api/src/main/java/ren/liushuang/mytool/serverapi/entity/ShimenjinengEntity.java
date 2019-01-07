package ren.liushuang.mytool.serverapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShimenjinengEntity {
    private int level;
    private int coin;
    private int coinTotal;
    private int exp;
    private int expTotal;
}
