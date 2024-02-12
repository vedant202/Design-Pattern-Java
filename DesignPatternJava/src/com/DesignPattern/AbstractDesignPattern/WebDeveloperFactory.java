package com.DesignPattern.AbstractDesignPattern;

public class WebDeveloperFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new WebDeveloper();
	}

}
