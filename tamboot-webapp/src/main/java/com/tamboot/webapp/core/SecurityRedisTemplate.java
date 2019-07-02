package com.tamboot.webapp.core;

import com.tamboot.redis.core.TambootRedisTemplate;
import org.springframework.data.redis.core.RedisTemplate;

public class SecurityRedisTemplate extends TambootRedisTemplate<SecurityRedisNamespace> {
    private static final String NAMESPACE_PREFIX = "tamboot:security:";

    public SecurityRedisTemplate(RedisTemplate redisTemplate) {
        super(redisTemplate);
    }

    @Override
    protected String resolveNamespaceValue(SecurityRedisNamespace namespace) {
        return NAMESPACE_PREFIX.concat(namespace.getCode());
    }
}
