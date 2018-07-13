package com.helian.health.service.impl;

import com.helian.health.cache.RedisService;
import com.helian.health.domain.honor.HealthHonorInfo;
import com.helian.health.mapper.HealthHonorInfoMapper;
import com.helian.health.service.HealthHonorService;
import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HealthHonorServiceImpl implements HealthHonorService {

	@Autowired
	private HealthHonorInfoMapper healthHonorInfoMapper;
	@Autowired
    private RedisService redisService;

	@Override
	public List<HealthHonorInfo> getHonorInfo(String user_id,Integer id) {
		return healthHonorInfoMapper.selectHonorByUserId(user_id, id);
	}

	@Override
	public void addPatientInfoHonor(String user_id) {
        if (!redisService.sismember("patientAddHonor", user_id)) {
            //若用户健康档案的勋章没有，并且用户已经建立健康档案。则给用户增加健康档案的勋章
            if(healthHonorInfoMapper.findHonorByUserId(user_id,2) == null
                && healthHonorInfoMapper.findCountPatientInfo(user_id) > 0){
                healthHonorInfoMapper.insert(user_id,2);
				redisService.hset("app_message", "unreadNoticeNumberByHealthRecords:" + user_id,"1");
				redisService.hset("app_message", "unreadNoticeMessageByHealthRecords:" + user_id,"你获得了【健康达人】称号");
				redisService.hset("app_message", "unreadNoticeDateByHealthRecords:" + user_id, DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
				redisService.hset("app_message", "unreadNoticeHonorIdMessageByHealthRecords:" + user_id,"2");
                redisService.sadd("patientAddHonor" , user_id);
            }
        }
	}

	@Override
	public HealthHonorInfo getHonorInfoById(String user_id, Integer id) {
		return null;
	}

}
