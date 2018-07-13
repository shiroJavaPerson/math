package com.helian.health.service;

import com.helian.health.domain.level.LevelReward;
import com.helian.health.domain.level.UserHscoreLevel;

import java.util.List;

/**
 * Created by Administrator on 2016/12/28.
 */
public interface UserHscoreLevelService {

    /**
     * @author xsh
     * @since 2016-12-28
     * 根据userId查询经验值，等级等信息
     * @param userId
     * @return
     */
    UserHscoreLevel findLevelByUserId(String userId);

    /**
     * 查询等级奖励信息
     * @author xsh
     * @since
     * @return
     */
    List<LevelReward> findLevelReward();
}
