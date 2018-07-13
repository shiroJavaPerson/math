package com.helian.health.domain.honor;

import java.util.Date;

public class HealthHonorInfo {
    private Integer id;

    private String userId;

    private Integer honorId;

    private Date createTime;
    
    private HealthHonor healthHonor;
    
    public HealthHonor getHealthHonor() {
		return healthHonor;
	}

	public void setHealthHonor(HealthHonor healthHonor) {
		this.healthHonor = healthHonor;
	}

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

    public Integer getHonorId() {
        return honorId;
    }

    public void setHonorId(Integer honorId) {
        this.honorId = honorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}