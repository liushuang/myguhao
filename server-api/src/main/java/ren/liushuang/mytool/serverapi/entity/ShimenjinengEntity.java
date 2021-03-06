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
    private long coin;
    private long coinTotal;
    private long exp;
    private long expTotal;
}
