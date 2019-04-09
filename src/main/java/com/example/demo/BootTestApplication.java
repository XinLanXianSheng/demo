package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
 * 这是不用再Tomcat中运行时启动项目
 * @author LuoXu
 *
 */
@SpringBootApplication
public class BootTestApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BootTestApplication.class, args);
	}
}
