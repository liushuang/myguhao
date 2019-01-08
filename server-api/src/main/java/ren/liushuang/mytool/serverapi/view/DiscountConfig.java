package ren.liushuang.mytool.serverapi.view;

import lombok.Data;

@Data
public class DiscountConfig {
    private double totalDiscount = 1;
    private double coinMoneyRate = 30000000/300;
    private double banggongToCoinRate = 30 * coinMoneyRate / 1000;
}
