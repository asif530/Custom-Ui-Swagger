package com.custom.swagger.ui.swaggerui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SwaggerUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerUiApplication.class, args);
	}

}
