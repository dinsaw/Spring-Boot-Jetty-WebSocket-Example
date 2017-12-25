package com.dineshsawant.websocketdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.dineshsawant.websocketdemo")
@EnableAutoConfiguration
public class WebsocketdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketdemoApplication.class, args);
	}
}
