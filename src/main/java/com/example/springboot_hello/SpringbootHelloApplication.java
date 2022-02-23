package com.example.springboot_hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;


@SpringBootApplication
@Slf4j
public class SpringbootHelloApplication implements CommandLineRunner {

    @Autowired
    DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloApplication.class, args);
    }

    @Override
    public void run (String... args) throws Exception{
        log.info("dataSource.toString()");
        log.info(dataSource.toString());
        Connection conn = dataSource.getConnection();
        log.info("conn.toString()");
        log.info(conn.toString());
        conn.close();
    }

}
