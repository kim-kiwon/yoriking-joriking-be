package com.cook.yoriking.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
	@Bean
	public OpenAPI openAPI(@Value("${springdoc.version}") String docVersion) {
		Info info = new Info()
			.title("Gogonew")
			.version(docVersion)
			.description("gogonew API 문서입니다");

		return new OpenAPI()
			.components(new Components())
			.info(info);
	}
}
