package me.hyunsoo.howtoredis.account;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("accounts")
@Getter
@Setter
@ToString
public class Account {

    private String id;

    private String username;

    private String email;

}
