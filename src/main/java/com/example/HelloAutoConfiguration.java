package com.example;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {
	@Bean
	public Hello hello(HelloProperties helloProperties) {
		return new Hello(helloProperties);
	}
}
