package com.helian.health.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * spring boot redis配置
 * 
 * @author xiongsh on 2016/12/7.
 */
@Configuration
public class RedisConfig{
	
	@Bean
	public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory){
		StringRedisTemplate template = new StringRedisTemplate(factory);
		template.setValueSerializer(new StringRedisSerializer());
		template.afterPropertiesSet();
		return template;
	}
}
