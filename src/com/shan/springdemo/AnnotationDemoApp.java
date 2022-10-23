package com.shan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		 
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
