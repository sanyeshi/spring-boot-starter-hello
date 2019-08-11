package com.example;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

public class HelloAutoConfigurationTest {
	private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
			.withConfiguration(AutoConfigurations.of(HelloAutoConfiguration.class));
	
	@Test
	public void autoConfigTest() {
		this.contextRunner.withPropertyValues("hello.msg=hi").run((context) -> {
			assertThat(context).hasSingleBean(Hello.class);
			assertThat(context.getBean(Hello.class).sayHi()).isEqualTo("hi");
		});
	}
}
