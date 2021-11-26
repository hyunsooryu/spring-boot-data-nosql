package me.hyunsoo.howtoredis.account;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Getter
@Setter
public class Person {

    private long id;

    private String name;
}
