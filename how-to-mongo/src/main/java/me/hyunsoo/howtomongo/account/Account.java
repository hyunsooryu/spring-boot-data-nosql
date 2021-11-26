package me.hyunsoo.howtomongo.account;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "accounts")
@Getter
@Setter
@ToString
public class Account {
    @Id
    private String id;

    private String username;

    private String email;

}
