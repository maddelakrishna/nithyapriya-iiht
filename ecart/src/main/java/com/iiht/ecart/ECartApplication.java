package com.iiht.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.iiht.ecart")
public class ECartApplication {

	public static void main(String[] args) {

  SpringApplication.run(ECartApplication.class, args);

	}

}
