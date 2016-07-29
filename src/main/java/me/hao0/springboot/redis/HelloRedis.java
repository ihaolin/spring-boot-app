package me.hao0.springboot.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Properties;

/**
 * Author: haolin
 * Date:   7/29/16
 * Email:  haolin.h0@gmail.com
 */
@Repository
public class HelloRedis {

    @Autowired
    private StringRedisTemplate redis;

    public Properties info(){
        return redis.execute(new RedisCallback<Properties>() {
            @Override
            public Properties doInRedis(RedisConnection conn) throws DataAccessException {
                return conn.info();
            }
        });
    }
}
