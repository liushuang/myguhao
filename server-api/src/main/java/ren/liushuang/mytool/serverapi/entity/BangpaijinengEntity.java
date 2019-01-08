package ren.liushuang.mytool.serverapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BangpaijinengEntity {
    private int level;
    private long exp;
    private long expTotal;
    private long coin;
    private long coinTotal;
    private int banggongTotal;
    private JinengType type;
}
