package com.helian.health.domain.honor;

import io.swagger.models.auth.In;

import java.util.Date;

public class HealthHonor {
    private Integer id;

    private String name;

    private Integer type;

    private Integer required;

    private String imgUrl;

    private Date createTime;

    private String isShow;

    private String notFinishedImgUrl;

    private Integer rewardType;

    private Integer rewardValue;

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRewardType() {
        return rewardType;
    }

    public void setRewardType(Integer rewardType) {
        this.rewardType = rewardType;
    }

    public Integer getRewardValue() {
        return rewardValue;
    }

    public void setRewardValue(Integer rewardValue) {
        this.rewardValue = rewardValue;
    }

    public String getNotFinishedImgUrl() {
        return notFinishedImgUrl;
    }

    public void setNotFinishedImgUrl(String notFinishedImgUrl) {
        this.notFinishedImgUrl = notFinishedImgUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getRequired() {
        return required;
    }

    public void setRequired(Integer required) {
        this.required = required;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }
}