package ren.liushuang.mytool.serverapi.view;

import java.util.List;

import lombok.Data;

@Data
public class FuzhuJinengView {
    private long coin;
    private long money;
    private int discount = 100;
    private List<FuzhuJinengDetail> detailList;
}
