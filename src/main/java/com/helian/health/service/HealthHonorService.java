package com.helian.health.service;

import com.helian.health.domain.honor.HealthHonorInfo;

import java.util.List;

public interface HealthHonorService {
	
	/**
	 * 根据user_id拿到用户已完成的荣誉任务列表
	 * @author xsh
	 * time:2016-12-5
	 * @param user_id
	 * @return
	 */
	List<HealthHonorInfo> getHonorInfo(String user_id, Integer id);

    /**
     * 给老用户增加建立健康档案勋章。若老用户建立了健康档案而没有获得勋章则执行该方法
     * @author xsh
     * @since 2016-12-14
     * @param user_id
     */
    void addPatientInfoHonor(String user_id);

    /**
     * 根据user_id和荣誉Id，获取该荣誉的详细信息
     * @param user_id
     * @param id 荣誉Id
     * @return
     */
    HealthHonorInfo getHonorInfoById(String user_id, Integer id);
}
