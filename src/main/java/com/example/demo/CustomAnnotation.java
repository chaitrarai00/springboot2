package com.example.demo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Endpoint(id="endpoint1")
@Component
public class CustomAnnotation {
	
	@ReadOperation
	@Bean
	public String custome() {
		return "Customs:{actuator endpoint}";
	}
}
