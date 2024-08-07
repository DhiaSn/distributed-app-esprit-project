package com.espritdistributedapp.memberservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MemberserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberserviceApplication.class, args);
	}

}
