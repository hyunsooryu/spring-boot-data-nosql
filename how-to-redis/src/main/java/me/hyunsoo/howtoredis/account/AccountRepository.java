package me.hyunsoo.howtoredis.account;

import org.springframework.data.repository.CrudRepository;

//CrudRepository -> springdata의 아주아주 기본적인, 최상위쪽에 가까운 인터페이스입니다.

public interface AccountRepository extends CrudRepository<Account, String> {

}
