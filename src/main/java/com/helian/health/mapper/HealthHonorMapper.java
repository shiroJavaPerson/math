package com.helian.health.mapper;

import com.helian.health.domain.honor.HealthHonor;

import java.util.List;


public interface HealthHonorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HealthHonor record);

    HealthHonor selectByPrimaryKey(Integer id);

    List<HealthHonor> selectAll();

    int updateByPrimaryKey(HealthHonor record);
}