package com.shan.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunningJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		RunningCoach theCoach = context.getBean("runningCoach",RunningCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		 
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		
		
		context.close();
	}

}
