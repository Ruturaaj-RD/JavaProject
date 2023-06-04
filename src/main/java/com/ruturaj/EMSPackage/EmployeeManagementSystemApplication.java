package com.ruturaj.EMSPackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

@SpringBootApplication
public class EmployeeManagementSystemApplication extends WsConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
	
	 public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/").setViewName("index");
	        registry.addViewController("/login").setViewName("login");
	    }

}
