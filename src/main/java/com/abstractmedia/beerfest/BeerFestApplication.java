package com.abstractmedia.beerfest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = BeerController.class)
public class BeerFestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BeerFestApplication.class, args);
	}

}
