package me.hyunsoo.howtoredis;

import me.hyunsoo.howtoredis.account.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Redis를 사용하는 방법
 * 1. StringRedisTemplate 또는 RedisTemplate
 * 2. extends CrudRepository = Jpa와 비슷한 구조
 *
 *

 * @ConditionalOnBean: 특정 BEAN CLASS나 이름이 Bean Factory에 포함되면 진행

 * @ConditionalOnClass: 특정 CLASS가 경로에 있으면 진행

 * @ConditionalOnCloudPlatform: 특정 클라우드 플랫폼(enum CloudPlatform) 환경이면 진행

 * @ConditionalOnExpression: SpEL에 의존하는 조건이면 진행

 * @ConditionalOnJava: JVM 버전이 일치하면 진행

 * @ConditionalOnJndi: JNDI를 사용할 수 있고 특정 위치에 있으면 진행

 * @ConditionalOnMissingBean: 특정 BEAN CLASS나 이름이 Bean Factory에 없으면 진행

 * @ConditionalOnMissingClass: 특정 CLASS가 경로에 없으면 진행

 * @ConditionalOnNotWebApplication: 웹 어플리케이션이 아니면 진행

 * @ConditionalOnProperty: 특정 프로퍼티가 지정한 값이면 진행

 * @ConditionalOnResource: 특정 리소스가 클래스 경로에 있으면 진행

 * @ConditionalOnSingleCandidate: 지정한 BEAN CLASS가 이미 Bean Factory에 포함되고 단일 후보자 지정이 가능하면 진행

 * @ConditionalOnWebApplication: 웹 어플리케이션이면 진행



 RedisTemplate 사용하고 싶다면, serializer, deserializer를 클래스에 알맞게 오버라이딩 해줘야 합니다.

 그 외는, 그냥 CrudRepository 쓰는게 나을듯..

 Redis 주요 커맨드

 keys *

 get {key}

 hgetall {key}

 hget {key} {column}

 **/


@SpringBootApplication
public class HowToRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(HowToRedisApplication.class, args);
    }

    @Bean
    RedisTemplate<byte[], byte[]> tmpRedisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<byte[], byte[]> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }
}
