package com.servicedesk.sapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.servicedesk.sapi.service.AuditorAwareService;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class ServicedeskApiApplication {

	@Bean
	public AuditorAware<String> auditorAware() {
		return new AuditorAwareService();
	};

	public static void main(String[] args) {
		SpringApplication.run(ServicedeskApiApplication.class, args);
	}

}
