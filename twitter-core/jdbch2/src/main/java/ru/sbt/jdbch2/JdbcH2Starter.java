package ru.sbt.jdbch2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class JdbcH2Starter {
    public static void main(String[] args) {
        SpringApplication.run(JdbcH2Starter.class, args);
    }
}
