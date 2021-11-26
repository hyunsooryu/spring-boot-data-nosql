package me.hyunsoo.howtoneo4j;

import lombok.RequiredArgsConstructor;
import org.neo4j.driver.Session;
import org.neo4j.driver.internal.SessionFactory;
import org.neo4j.driver.internal.SessionFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class Neo4jRunner implements ApplicationRunner {



    final SessionFactoryImpl sessionFactory;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Session session = sessionFactory.
    }
}
