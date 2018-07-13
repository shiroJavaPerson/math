package com.helian.health.cache.impl;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.helian.health.cache.RedisService;
import com.helian.health.util.RedisKeyConstants;

@SuppressWarnings("unchecked")
@Component
public class RedisServiceImpl implements RedisService {

    private Logger logger = Logger.getLogger(RedisServiceImpl.class);

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }


    @Override
    public void set(String key, String value, Long expireTime) {
        redisTemplate.opsForValue().set(key, value, expireTime, TimeUnit.SECONDS);
    }
    
    @Override
    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public void hset(String key, String field, String value) {
        redisTemplate.opsForHash().put(key, field, value);
    }

    @Override
    public String hget(String key, String field) {
        return (String) redisTemplate.opsForHash().get(key, field);
    }

    @Override
    public void hset(String key, String field, String value, Long expireTime) {
        redisTemplate.opsForHash().put(key, field, value);
        redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
    }

    @Override
    public boolean validate(String user_id, String token) {
        boolean flag = false;
        if(StringUtils.isBlank(user_id)){
            return true;
        }
        if(StringUtils.isBlank(token)){
            return false;
        }
        String reToken = (String)get(RedisKeyConstants.APP_LOGIN_TOKEN_+user_id);
        logger.info("user_id:  "+user_id +"  token-----------" + reToken);
        logger.info("ture or false:" + token.equals(reToken));
        if (token.equals(reToken)) {
            set(RedisKeyConstants.APP_LOGIN_TOKEN_+user_id, reToken);
            flag = true;
        }
        return flag;
    }

    @Override
    public long ttl(String key) {
        return redisTemplate.getExpire(key);
    }

    @Override
    public long ttl(String key, TimeUnit unit) {
        return redisTemplate.getExpire(key, unit);
    }

    @Override
    public Long sadd(String key, String... members) {
        return redisTemplate.opsForSet().add(key,members);
    }

    @Override
    public boolean sismember(String key,String value) {
        return redisTemplate.opsForSet().isMember(key,value);
    }

    @Override
    public void del(String key) {
        redisTemplate.delete(key);
    }

    @Override
    public Long srem(String key, String...members) {
        return redisTemplate.opsForSet().remove(key, members);
    }

    @Override
    public void hdel(String key, String...field) {
        redisTemplate.opsForHash().delete(key,field);
    }
}
