package com.DesignPattern.ObserverDesignPattern;

//The Observer Design Pattern is a behavioral design pattern where an object, 
//known as the subject, maintains a list of its dependents, known as observers, 
//that are notified of any changes in the subject's state

/*
 * example:- Youtbe and subscriber,
 * 	when Video is uploaded on youtube channel all subscriber gets notified 
 * 
 */


public class Main {
	public static void main(String[] args) {
		Observer vedant = new Subscriber("Vedant");
		Observer aryan = new Subscriber("Aryan");
		Subject youtube = new Youtube();
		
		youtube.subscribe(vedant);
		youtube.subscribe(aryan);
		youtube.notifyVideoUploaded("Learn Next.Js");
	}
}
