package com.example.architecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ArchitectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchitectureApplication.class, args);

	}

}
