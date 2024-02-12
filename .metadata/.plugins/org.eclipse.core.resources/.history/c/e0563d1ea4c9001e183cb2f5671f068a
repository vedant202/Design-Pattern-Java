package com.DesignPattern.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MyIteratorImpl implements MyIterator {
	
	private List<User> users = null;
	private int length;
	private int position;
	
	public MyIteratorImpl(List<User> list) {
		// TODO Auto-generated constructor stub
		users = list;
		length = users.size();
		position = 0;
		
	}
	
	
	
	
	
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position>=length)
			return false;
		return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		User u = users.get(position);
		position+=1;
		
		return u;
	}
	
	
	
	

}
