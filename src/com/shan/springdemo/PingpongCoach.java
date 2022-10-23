package com.shan.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PingpongCoach implements Coach {
	
	public PingpongCoach() {
		System.out.println("PingpongCoach: inside default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
