package com.shan.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.shan.springdemo")
@PropertySource("classpath:sport.properties")
public class RunningSportConfig {

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach runningCoach() {
		return new RunningCoach(sadFortuneService());
	}
}
