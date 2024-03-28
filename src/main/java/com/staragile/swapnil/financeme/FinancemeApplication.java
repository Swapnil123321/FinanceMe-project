package com.staragile.swapnil.financeme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class FinancemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancemeApplication.class, args);
	}
}