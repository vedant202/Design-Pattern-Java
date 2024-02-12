package com.DesignPattern.AbstractDesignPattern;

public class Main {
	public static void main(String[] args) {
		Employee andoridDev = EmployeeFactory.getEmployee(new AndroidDevFactory());
		System.out.println(andoridDev.salary());
		
		Employee webDev = EmployeeFactory.getEmployee(new WebDeveloperFactory());
		System.out.println(webDev.salary());
		
		Employee manager = EmployeeFactory.getEmployee(new ManagerFactory());
		System.out.println(manager.salary());
	}
}
