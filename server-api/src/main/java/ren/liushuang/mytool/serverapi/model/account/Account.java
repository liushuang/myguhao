package ren.liushuang.mytool.serverapi.model.account;

import java.util.Map;

import lombok.Data;

@Data
public class Account {
    /**
     * 全部技能
     * 1-132：师门技能
     * 201-237：生活技能
     *      * 201强身
     *      * 202冥想
     *      * 230强壮
     *      * 237神速
     */
    private Map<Integer,Integer> allSkills;

    private RenwuXiulian renwuXiulian;
    private ChongwuXiulian chongwuXiulian;
}
