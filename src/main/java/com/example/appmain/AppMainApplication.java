package com.example.appmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.appmain.*","com.example.appone.*","com.example.apptwo.*" })
public class AppMainApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AppMainApplication.class, args);
	}
}