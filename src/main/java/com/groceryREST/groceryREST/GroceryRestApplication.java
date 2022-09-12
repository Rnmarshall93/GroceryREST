package com.groceryREST.groceryREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GroceryRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceryRestApplication.class, args);
	}

}
