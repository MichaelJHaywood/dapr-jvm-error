package com.example.dapr.dapr;

import io.dapr.client.DaprClient;
import io.dapr.client.DaprClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DaprApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaprApplication.class, args);
	}

	@Bean
	public DaprClient daprClient() {
		return new DaprClientBuilder().build();
	}
}
