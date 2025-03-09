package com.dreamzdesigno.E_commerce.BackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan({"com.dreamzdesigno.E_commerce.BackEnd"})
public class ECommerceBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceBackEndApplication.class, args);


	}

}
