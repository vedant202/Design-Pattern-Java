package com.DesignPattern.FactoryDesignPattern;

public class EmployeeFactory {
	public static Employee getEmployee(String employeeDesig) {
		if(employeeDesig.trim().equalsIgnoreCase("Android Developer")) {
			return new AndroidDeveloper();
		}
		else if (employeeDesig.trim().equalsIgnoreCase("Web Developer")) {
			return new WebDeveloper();
		}
		return null;
	}
}
