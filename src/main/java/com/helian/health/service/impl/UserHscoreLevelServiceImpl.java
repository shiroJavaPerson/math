package com.helian.health.service.impl;

import com.helian.health.domain.level.LevelReward;
import com.helian.health.domain.level.UserHscoreLevel;
import com.helian.health.mapper.UserHscoreLevelMapper;
import com.helian.health.service.UserHscoreLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/12/28.
 */
@Service
public class UserHscoreLevelServiceImpl implements UserHscoreLevelService {

    @Autowired
    private UserHscoreLevelMapper userHscoreLevelMapper;

    @Override
    public UserHscoreLevel findLevelByUserId(String userId) {
        return userHscoreLevelMapper.selectByUserId(userId);
    }

    @Override
    public List<LevelReward> findLevelReward() {
        return userHscoreLevelMapper.findLevelReward();
    }
}
