package ren.liushuang.mytool.serverapi.model.account;

import lombok.Data;

@Data
public class RenwuXiulian {
    // 攻击修炼
    private int iExptSki1;
    // 防御修炼
    private int iExptSki2;
    // 法术修炼
    private int iExptSki3;
    // 抗法修炼
    private int iExptSki4;
    // 猎术修炼
    private int iExptSki5;

    // 攻击上限
    private int iMaxExpt1;
    // 防御上限
    private int iMaxExpt2;
    // 法术上限
    private int iMaxExpt3;
    // 抗法上限
    private int iMaxExpt4;
}
