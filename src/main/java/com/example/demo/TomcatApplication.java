package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 通过Tomcat启动spring boot
 * 将项目的启动类Application.java继承SpringBootServletInitializer并重写configure方法
 * @author LuoXu
 *
 */
@SpringBootApplication
public class TomcatApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TomcatApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TomcatApplication.class, args);
	}

}
