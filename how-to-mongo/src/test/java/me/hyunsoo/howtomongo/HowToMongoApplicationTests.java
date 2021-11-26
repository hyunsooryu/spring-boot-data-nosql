package me.hyunsoo.howtomongo;

import me.hyunsoo.howtomongo.account.Account;
import me.hyunsoo.howtomongo.account.AccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

//application.properties -> spring.mongodb.embedded.version=3.0.0  해줘야 합니다.
//MongoRepository 관련 Bean만 주입이 됩니다.
@DataMongoTest
class HowToMongoApplicationTests {

    @Autowired
    AccountRepository accountRepository;

    @Test
    void findAccountByIdTest(){

       Account account1 = new Account();
       account1.setId("account-1");
       account1.setUsername("user-1");
       account1.setEmail("aaa.bbb.com");

       accountRepository.insert(account1);

        Account account2 = new Account();
        account2.setId("account-2");
        account2.setUsername("user-2");
        account2.setEmail("ccc.ddd.com");

        accountRepository.insert(account2);


       List<Account> accountList =  accountRepository.findAll();
       accountList.stream().forEach(System.out::println);
       Optional<Account> account3 = accountRepository.findByEmail("aaa.bbb.com");
       System.out.println(account3.orElse(null));
       Optional<Account> account4 = accountRepository.findById("account-2");
       System.out.println(account4.orElse(null));
    }

}
