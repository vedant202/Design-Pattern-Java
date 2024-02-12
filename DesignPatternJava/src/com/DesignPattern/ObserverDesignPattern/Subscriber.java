package com.DesignPattern.ObserverDesignPattern;

public class Subscriber implements Observer {
	String name;
	
	public Subscriber(String name) {
		this.name = name;
	}
	
	@Override
	public void notifiedChanges(String Title) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"you have a Notification from youtube title :- "+Title);
		
	}
	
	

}
