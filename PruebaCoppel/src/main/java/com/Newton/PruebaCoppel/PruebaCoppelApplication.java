package com.Newton.PruebaCoppel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PruebaCoppelApplication {
	public static void main(String[] args) {
		SpringApplication.run(PruebaCoppelApplication.class, args);
	}

}
