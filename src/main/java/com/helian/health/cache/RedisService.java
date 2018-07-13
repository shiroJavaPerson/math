package com.helian.health.cache;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

/**
 * redis工具类
 * @author  xiongsh on 2016/12/7.
 */
@Component
public interface RedisService{

    /**
     * 设置键值
     * @author xiongsh
     * @since 2016/12/7
     * @param key
     * @param value
     */
	void set(String key, String value);

    /**
     * 设置键值并设置过期时间
     * @author xiongsh
     * @since 2016/12/7
     * @param key
     * @param value
     * @param expireTime 过期时间，单位秒
     */
    void set (String key, String value, Long expireTime);



    public Object get(String key);
    
    /**
     * 设置哈希表键值对
     * @author xiongsh
     * @since 2016/12/8
     * @param key
     * @param field
     * @param value
     */
    void hset(String key, String field, String value);
    
    /**
     * 从哈希表中取值
     * @author xiongsh
     * @since 2016/12/8
     * @param key
     * @param field
     * @return
     */
    String hget(String key, String field);
    
    /**
     * 设置哈希表键值对并设置过期时间
     * @author xiongsh
     * @since 2016/12/8
     * @param key
     * @param field
     * @param value
     */
    void hset(String key, String field, String value, Long expireTime);

    /**
	 * 验证用户token是否过期
	 * @author xiongsh
	 * @since 2016/12/8
	 * @param user_id
	 * @param token
	 * @return
	 */
	boolean validate(String user_id,String token);

    /**
     * 获取键的过期时间
     * @author xiongsh
     * @since 2016/12/10
     * @param key 键
     * @return 单位秒
     */
	long ttl(String key);

    /**
     * 获取键的过期时间，可传入一个TimeUnit返回所需要的时间单位
     * @author xiongsh
     * @since 2016/12/10
     * @param key 键
     * @param unit 时间单位
     * @return
     */
    long ttl(String key, TimeUnit unit);

    /**
     * 添加成员到Set中
     * @author xiongsh
     * 2016-12-15
     * @param key
     * @param members
     * @return
     */
    Long sadd(String key, String...members);

    /**
     * 判断 key,value 是否集合 set 的成员
     * @param key
     * @param value
     * @return
     */
    boolean sismember(String key,String value);

    /**
     * 删除键
     * @author xsh
     * @since 2017-1-4
     * @param key
     */
    void del(String key);

    /**
     * 从set中删除
     * @author xsh
     * @since 2017-1-4
     * @param key
     * @param members
     * @return
     */
    Long srem(String key, String...members);

    /**
     * 从哈希中删除
     * @author xsh
     * @since 2017-1-4
     * @param key
     * @param field
     */
    void hdel(String key, String...field);


}
