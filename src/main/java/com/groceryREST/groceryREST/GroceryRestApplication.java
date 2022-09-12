package com.groceryREST.groceryREST;

import com.groceryREST.groceryREST.Entity.GroceryItem;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Properties;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GroceryRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceryRestApplication.class, args);
	}

	@Bean
	Configuration configuration() throws IOException {

		String currentPath = new java.io.File(".").getCanonicalPath();
		System.out.println("Current dir:" + currentPath);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(GroceryItem.class);



		InputStream secretFile = new FileInputStream("secretFile");
		Properties secretProps = new Properties();
		secretProps.load(secretFile);

		String hostString = secretProps.getProperty("hostString");
		String dbUser = secretProps.getProperty("dbUser");
		String dbPass = secretProps.getProperty("dbPass");

		Properties settings = new Properties();

		settings.put(Environment.URL, hostString);
		settings.put(Environment.USER, dbUser);
		settings.put(Environment.PASS, dbPass);
		settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

		configuration.addProperties(settings);

		return configuration;
	}

}
