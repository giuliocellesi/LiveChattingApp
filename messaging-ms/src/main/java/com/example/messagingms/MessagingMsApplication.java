package com.example.messagingms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MessagingMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingMsApplication.class, args);
	}

}
