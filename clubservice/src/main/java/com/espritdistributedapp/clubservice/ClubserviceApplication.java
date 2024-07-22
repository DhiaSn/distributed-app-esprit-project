package com.espritdistributedapp.clubservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ClubserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClubserviceApplication.class, args);
	}

}
