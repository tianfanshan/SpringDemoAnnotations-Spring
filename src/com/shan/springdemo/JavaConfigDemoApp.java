package com.shan.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		 
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
