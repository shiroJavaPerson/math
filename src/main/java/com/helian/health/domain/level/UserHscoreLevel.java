package com.helian.health.domain.level;

import java.util.Date;

public class UserHscoreLevel {
    private Integer id;

    private String userId;

    private Double hScore;

    private Date createTime;

    private Date modifyTime;

    private Integer level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Double gethScore() {
        return hScore;
    }

    public void sethScore(Double hScore) {
        this.hScore = hScore;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}