package me.hyunsoo.howtoredis;

import lombok.RequiredArgsConstructor;
import me.hyunsoo.howtoredis.account.Account;
import me.hyunsoo.howtoredis.account.AccountRepository;
import me.hyunsoo.howtoredis.account.Person;
import me.hyunsoo.howtoredis.account.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class RedisRunner implements ApplicationRunner {

    private final StringRedisTemplate redisTemplate;

    private final LettuceConnectionFactory lettuceConnectionFactory;

    private final AccountRepository accountRepository;

    //  private final PersonRepository personRepository;

    private final RedisTemplate<byte[], byte[]> tmpRedisTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {


        /**
         ValueOperations<String, String> values = redisTemplate.opsForValue();
         values.set("hyunsoo", "gsshop-developer");
         values.set("springboot", "master");
         values.set("hello", "world");
         **/
        /**
         Account account = new Account();
         account.setId("fuck");
         account.setEmail("blessdutch@naver.com");
         account.setUsername("hyunsoo");

         Account account1 = accountRepository.save(account);
         **/


    }

}
