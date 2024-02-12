package com.DesignPattern.AbstractDesignPattern;

public class EmployeeFactory {
	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		return factory.createEmployee();
		
	}
}
