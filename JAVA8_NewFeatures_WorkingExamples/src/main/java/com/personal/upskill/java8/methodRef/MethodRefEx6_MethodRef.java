package com.personal.upskill.java8.methodRef;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MethodRefEx6_MethodRef {

	public static void main(String[] args) {
		List<Employee> lstEmp = Arrays.asList(new Employee("George", 33), new Employee("Rajat", 50),
				new Employee("Arun", 49));

		lstEmp.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));

		Function<Employee, String> fnt = emp -> emp.getName();

		/** Comparator.comparing() Lambda */
		lstEmp.sort(Comparator.comparing(emp -> emp.getName()));

		/** Comparator.comparing() with METHOD REFERENCE */
		lstEmp.sort(Comparator.comparing(Employee::getName));

		Collections.sort(lstEmp, Employee::compareEmployeeByName);

		Collections.sort(lstEmp, (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
		Collections.sort(lstEmp, new Employee()::compareEmployeeByAge);

		lstEmp.sort(Employee::compareEmployeeByName);
		lstEmp.sort(new Employee()::compareEmployeeByAge);

	}

}

class Employee {
	private String name;
	private int age;

	void formatName(Employee employee) {
		System.out.println(employee.getName().toUpperCase());

	}

	static int compareEmployeeByName(Employee emp1, Employee emp2) {
		return emp1.getName().compareTo(emp1.getName());
	}

	int compareEmployeeByAge(Employee emp1, Employee emp2) {
		return Integer.compare(emp1.getAge(), emp2.getAge());
	}

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