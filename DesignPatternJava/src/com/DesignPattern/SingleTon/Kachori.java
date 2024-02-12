package com.DesignPattern.SingleTon;

//Enums are often used to implement the singleton pattern, 
//where only one instance of the enum class is allowed.
//The singleton instance is created when the enum class is loaded.


public enum Kachori {
	Instace;
	
	public void test() {
		System.out.println("Testing kachori enum");
	}
}
