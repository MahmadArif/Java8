package com.personal.upskill.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Java 8 Session 2 Desc: Example use of Comparator with Anonymous inner class
 * method 
 * 
 * @author
 *
 */
public class LambdaEx10_ComparatorAnonymousInnerClass {

	public static void main(String[] args) {
		List<Employee> empLst = Arrays.asList(new Employee("Rajat", 36), 
											  new Employee("George", 33),
											  new Employee("Shajan", 43));
		Comparator<Employee> employeeSortByNameComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		};
		
		System.out.println("*******BEFOR SORTING*********");
		empLst.forEach(System.out::println);
		Collections.sort(empLst,employeeSortByNameComparator);
		System.out.println("*******AFTER SORTING*********");
		empLst.forEach(System.out::println);
		
	}
}

class Employee {
	private String name;
	private int age;

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