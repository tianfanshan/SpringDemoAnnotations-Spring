package com.shan.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "sad fortune";
	}

}
