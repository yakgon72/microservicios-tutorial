package com.moto.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient   // para registrar el servicio en el servidor de eureka
public class MotoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotoServiceApplication.class, args);
	}

}
