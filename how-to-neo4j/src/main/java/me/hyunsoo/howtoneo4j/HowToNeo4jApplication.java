package me.hyunsoo.howtoneo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * neo4J
 *
 * 도커설정 - 2개의 포트로 매핑
 * docker run -p 7474:7474 -p 7687:7687 -d --name neo4j_boot neo4j
 *
 * @
 *
 *
 */


@SpringBootApplication
public class HowToNeo4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(HowToNeo4jApplication.class, args);
    }

}
