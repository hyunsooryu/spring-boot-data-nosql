package me.hyunsoo.howtomongo;

import lombok.RequiredArgsConstructor;
import me.hyunsoo.howtomongo.account.Account;
import me.hyunsoo.howtomongo.account.AccountRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;


/**
 * Spring Boot 에서 몽고 DB를 사용하는 법
 * <p>
 * Docker를 사용해서 띄우겠습니다.
 * <p>
 * 스프링 부트가 기본으로 몽고디비를 접근 할 때 localhost : 27017로 접근합니다.
 * <p>
 * //최초 run
 * docker run - p 27017:27017 --name mongo_boot -d mongo
 * <p>
 * 시작
 * docker start mongo_boot
 * 종료
 * docker stop mongo_boot
 * 이미지 실행
 * docker exec -i -t mongo_boot bash
 * cli
 * mongo
 * <p>
 * MongoDB는 JSON 기반의 도큐먼트 데이터베이스입니다.
 * <p>
 * 의존성 추가 -> spring-boot-starter-data-mongodb
 * <p>
 * MongoDB in SpringBoot
 * <p>
 * MongoTemplate
 * MongoRepository
 * 내장형 MongoDB -> de.flapdoodle.embed:de.flapdoodle.embed.mongo
 * <p>
 * 의존성 추가하면, 테스트용 내장 몽고디비를 사용할 수 있다.
 *
 * @DataMongoTest
 */

@SpringBootApplication
@RequiredArgsConstructor
public class HowToMongoApplication {

    final MongoTemplate mongoTemplate;

    final AccountRepository accountRepository;

    public static void main(String[] args) {
        SpringApplication.run(HowToMongoApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {
            /**
             Account account = new Account();
             account.setId("account-2");
             account.setEmail("ccc@ddd.com");
             account.setUsername("account-2-name");

             //mongoTemplate.insert(account);
             **/

            //    Account account1 = mongoTemplate.findById("account-1", Account.class);
            //    System.out.println(account1);


            //accountRepository.insert(account);
            System.out.println(accountRepository.findById("account-2").orElse(null));


        };
    }


}
