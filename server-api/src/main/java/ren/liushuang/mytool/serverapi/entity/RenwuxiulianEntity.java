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
    private long xiulianExp;
    private XiulianType type;
    private long coin;
    private long coinTotal;
}
