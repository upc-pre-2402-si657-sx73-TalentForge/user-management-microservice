package com.acme.fromzeroapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class UserManagementMicroservice {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementMicroservice.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("http://localhost:4200")
						.allowedOrigins("https://fromzero-77cf7.web.app")
						.allowedMethods("*")
						.allowCredentials(true)
						.allowedHeaders("*");
			}
		};
	}
}
