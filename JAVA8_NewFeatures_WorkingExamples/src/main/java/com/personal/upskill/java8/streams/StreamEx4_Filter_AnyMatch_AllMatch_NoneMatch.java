package com.personal.upskill.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamEx4_Filter_AnyMatch_AllMatch_NoneMatch {

	public static void main(String[] args) {
		
		List<Employee> employeeLst = Arrays.asList(new Employee("Joshi",  40),
												   new Employee("Karthik",37),
												   new Employee("Arun",   30));
		/** Stream.filter() */
		employeeLst.stream().filter(emp->emp.getAge()>35).forEach(System.out::println);
		
		/** Stream.anyMatch */
		boolean result = employeeLst.stream().anyMatch(emp->emp.getName().equalsIgnoreCase("JOSHI"));
		System.out.println("THE LIST Contains an employee with name Joshi ="+result);
		
		/** Stream.allMatch */
		boolean resultMinAge = employeeLst.stream().allMatch(emp->emp.getAge()>=30);
		System.out.println("The age of all employees in the List >= 30 = "+resultMinAge);
		
		/** Stream.noneMatch */
		boolean resultMaxAge = employeeLst.stream().noneMatch(emp->emp.getAge()>=60);
		System.out.println("The age of all employees is less than or equal to 60 = "+resultMaxAge);
		
	}

}

class Employee {
	String name;
	int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	
}