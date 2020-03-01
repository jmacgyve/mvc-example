package ru.sbt.twitts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TwitterStarter {
	public static void main(String[] args) {
		SpringApplication.run(TwitterStarter.class, args);
	}
}
