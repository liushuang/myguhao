package ren.liushuang.mytool.serverapi.view;

import lombok.Data;

@Data
public class AccountView {
    private RenwuXiulianView renwuXiulianView;
    private ChongwuXiulianView chongwuXIulianView;
    private ShimenJinengView shimenJinengView;

    private DiscountConfig discountConfig;
}
