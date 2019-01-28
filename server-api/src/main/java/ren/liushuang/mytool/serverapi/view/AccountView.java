package ren.liushuang.mytool.serverapi.view;

import lombok.Data;

@Data
public class AccountView {
    private RenwuXiulianView renwuXiulianView;
    private ChongwuXiulianView chongwuXiulianView;
    private ShimenJinengView shimenJinengView;
    private FuzhuJinengView fuzhuJinengView;
    private DiscountConfig discountConfig;
}
