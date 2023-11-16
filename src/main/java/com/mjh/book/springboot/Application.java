package com.mjh.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableJpaAuditing
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		// run 매서드를 통해 내장 WAS 실행 가능
		SpringApplication.run(Application.class, args);
	}
}
