package com.DesignPattern.IteratorDesignPattern;

public class Main {
	public static void main(String[] args) {
		UserIml userManagement = new UserIml();
		
		userManagement.addUser(new User(1,"Vedant"));
		userManagement.addUser(new User(2,"Aryan"));
		userManagement.addUser(new User(3,"Laukeek"));
		
		MyIterator<User> iter = userManagement.iterator();
		
		while(iter.hasNext()) {
			User u =  iter.next();
			System.out.println(u);
		}
	}
}
