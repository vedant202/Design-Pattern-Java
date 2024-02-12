package com.DesignPattern.FactoryDesignPattern;


//The Factory Design and is also called Factory Method Design Pattern Pattern is a creational pattern that provides an interface for creating instances of a class, but it allows subclasses to alter the type of objects that will be created. It promotes loose coupling by abstracting the instantiation process, and it is often used when the exact class of the created object is not known until runtime or needs to be determined dynamically.


public class Main {
	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getEmployee("Web Developer");
		System.out.println(employee.employeeName()+" "+employee.getClass().getSimpleName()+" salary :- "+employee.salary());
	}
}
