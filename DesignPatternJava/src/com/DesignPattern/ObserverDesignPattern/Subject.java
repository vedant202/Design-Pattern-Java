package com.DesignPattern.ObserverDesignPattern;

public interface Subject {
	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	void notifyVideoUploaded(String Title);
}
