package com.spring.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.event.config.AppConfig;
import com.spring.event.publisher.ZeeCafePublisher;

@SpringBootApplication
public class SpringEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEventApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ZeeCafePublisher zeeCafePublisher = context.getBean("ZeeCafePublisher", ZeeCafePublisher.class);
		zeeCafePublisher.StreamBigBangTheory("EP - 004");
		
		zeeCafePublisher.streamComedyCircus("EP - 007");
	}

}
