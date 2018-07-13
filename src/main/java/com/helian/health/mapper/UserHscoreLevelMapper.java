package com.helian.health.mapper;

import com.helian.health.domain.level.LevelReward;
import com.helian.health.domain.level.UserHscoreLevel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserHscoreLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserHscoreLevel record);

    UserHscoreLevel selectByPrimaryKey(Integer id);

    List<UserHscoreLevel> selectAll();

    int updateByPrimaryKey(UserHscoreLevel record);

    /**
     * @author xsh
     * @since 2016-12-28
     * 根据userId查询经验值，等级等信息
     * @param userId
     * @return
     */
    UserHscoreLevel selectByUserId(@Param("userId") String userId);

    /**
     * 查询等级奖励信息
     * @author xsh
     * @since
     * @return
     */
    List<LevelReward> findLevelReward();
}