package com.helian.health.domain.level;

/**
 * Created by Administrator on 2016/12/28.
 */
public class LevelReward {
    private Integer id;
    private String rewardName;
    private String category;
    private Integer level;
    private Integer speedValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRewardName() {
        return rewardName;
    }

    public void setRewardName(String rewardName) {
        this.rewardName = rewardName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSpeedValue() {
        return speedValue;
    }

    public void setSpeedValue(Integer speedValue) {
        this.speedValue = speedValue;
    }
}
