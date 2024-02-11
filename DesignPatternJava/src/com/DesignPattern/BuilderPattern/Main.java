package com.DesignPattern.BuilderPattern;

public class Main {
	public static void main(String[] args) {
		User user1=new User.UserBuilder()
				.setUserId(101)
				.setUserName("Vedant")
				.setEmailId("vedant@gmail.com")
				.build();
		
		System.out.println(user1);
		
		User user2=User.UserBuilder.builder()
		.setUserId(102)
		.setUserName("Aryan")
		.setEmailId("aryan@gmail.com")
		.build();
		
		System.out.println(user2);
	}
}
