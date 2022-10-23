package com.shan.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		System.out.println("TennisCoach inside default constructor");
	}

	@PostConstruct
	public void myStartStuff() {
		System.out.println("my startStuff");
	}
	
	@PreDestroy
	public void myCleanupStuff() {
		System.out.println("my clean up stuff");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
