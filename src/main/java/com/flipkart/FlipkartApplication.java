package com.flipkart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FlipkartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FlipkartApplication.class, args);
	
		Controller controller = context.getBean(Controller.class);
		controller.flipkart();

	}

}

 