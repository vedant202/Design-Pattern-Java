package com.DesignPattern.FactoryDesignPattern;

public class Main {
	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getEmployee("Web Developer");
		System.out.println(employee.employeeName()+" "+employee.getClass().getSimpleName()+" salary :- "+employee.salary());
	}
}
