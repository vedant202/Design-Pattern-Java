package com.DesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject{

	List<Observer> subscribers = new ArrayList<Observer>();
	
	@Override
	public void subscribe(Observer obse) {
		// TODO Auto-generated method stub
		subscribers.add(obse);
		
	}

	@Override
	public void unsubscribe(Observer obse) {
		// TODO Auto-generated method stub
		subscribers.remove(obse);
		
	}

	@Override
	public void notifyVideoUploaded(String title) {
		// TODO Auto-generated method stub
		for(Observer o:subscribers) {
			o.notifiedChanges(title);
		}
		
	}
	
}
