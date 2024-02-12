package com.DesignPattern.IteratorDesignPattern;

public interface MyIterator<T> {
	boolean hasNext();
	
	T next();
}
