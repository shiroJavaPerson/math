package com.helian.health.mapper;

import com.helian.health.domain.honor.HealthHonorInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HealthHonorInfoMapper{
	int deleteByPrimaryKey(Integer id);

    int insert(@Param("user_id") String user_id,@Param("honor_id") Integer honor_id);

    HealthHonorInfo selectByPrimaryKey(Integer id);

    List<HealthHonorInfo> selectAll();

    int updateByPrimaryKey(HealthHonorInfo record);

    /**
     * 查询用户的勋章
     * @author xsh
     * @since 2016-12-14
     * @param user_id
     * @return
     */
    List<HealthHonorInfo> selectHonorByUserId(@Param("user_id") String user_id,@Param("id") Integer id);

    /**
     * 查询用户是否创建健康档案
     * @author xsh
     * @since 2016-12-14
     * @param user_id
     * @return
     */
    long findCountPatientInfo(@Param("user_id") String user_id);

    /**
     * 根据userId,荣誉id查询勋章
     * @param user_id
     * @param honor_id 荣誉id，即lianlian_box.app_health_honor表中的主键id
     * @return
     */
    HealthHonorInfo findHonorByUserId(@Param("user_id") String user_id, @Param("honor_id") Integer honor_id);
}
