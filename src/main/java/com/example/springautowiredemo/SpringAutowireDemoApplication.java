package com.example.springautowiredemo;

import com.example.springautowiredemo.comp.A;
import com.example.springautowiredemo.comp.B;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class SpringAutowireDemoApplication implements CommandLineRunner, ApplicationContextAware{
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringAutowireDemoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		B bean = applicationContext.getBean(B.class);
		bean.printCDetail();
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
