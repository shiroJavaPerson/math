package com.helian.health.domain.level;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by xsh on 2016/12/28.
 */
@ApiModel(value = "等级权益DTO", description = "等级权益DTO")
public class LevelRightDTO implements Serializable {
    private static final long serialVersionUID = 957818392819821781L;

    @ApiModelProperty(value = "达到该等级所需晋级条件",dataType = "字符串")
    private String conditions;

    @ApiModelProperty(value = "等级",dataType = "字符串")
    private String level;

    @ApiModelProperty(value = "权益奖励",dataType = "字符串")
    private String reward;

    @ApiModelProperty(value = "用户当前等级",dataType = "字符串")
    private String userLevel;

    public LevelRightDTO() {
    }

    public LevelRightDTO(String conditions, String level, String reward, String userLevel) {
        this.conditions = conditions;
        this.level = level;
        this.reward = reward;
        this.userLevel = userLevel;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }
}
