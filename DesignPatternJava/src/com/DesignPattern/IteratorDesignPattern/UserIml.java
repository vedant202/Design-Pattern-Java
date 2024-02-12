package com.DesignPattern.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class UserIml {
	private List<User> users = null;
	
	public UserIml() {
		users = new ArrayList<User>();
	}
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public User getUser(int index) {
		return users.get(index);
	}
	
	public MyIterator iterator() {
		return new MyIteratorImpl(users);
	}
	
}
