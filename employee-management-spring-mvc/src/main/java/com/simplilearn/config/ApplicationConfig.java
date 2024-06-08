package com.simplilearn.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.simplilearn.repository,com.simplilearn.service")
public class ApplicationConfig {
	
	@Bean
	@Scope(value = "singleton")
	public DataSource dataSource() {
		DriverManagerDataSource dataSoure = new DriverManagerDataSource();
		dataSoure.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSoure.setUrl("jdbc:mysql://localhost:3306/EmployeeDB");
		dataSoure.setUsername("root");
		dataSoure.setPassword("Simplilearn@123");
		return dataSoure;
	}
	
}
