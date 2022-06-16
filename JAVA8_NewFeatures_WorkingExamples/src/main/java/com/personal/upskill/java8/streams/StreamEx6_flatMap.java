package com.personal.upskill.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamEx6_flatMap {
	public static void main(String[] args) {

		Emp emp1 = new Emp("Amit", "Kumar");
		Emp emp2 = new Emp("Mani", "Mekala");
		Emp emp3 = new Emp("Jayaraman", "poocholan");
		Emp emp4 = new Emp("Shubham", "Kumar");

		Emp emp6 = new Emp("Selva", "Kumar");
		Emp emp7 = new Emp("Dhanabal", "Kumar");

		List<Emp> employeeLst1 = Arrays.asList(emp1, emp2, emp3, emp4);
		List<Emp> employeeLst2 = Arrays.asList(emp6, emp7);

		Manager manager1 = new Manager("Bijo", employeeLst1);
		Manager manager2 = new Manager("Mohan", employeeLst2);

		List<Manager> managerList = Arrays.asList(manager1, manager2);

		/** LIST ALL THE EMPLOYEE's */
		//managerList.stream().flatMap(manager -> manager.getEmployeeList().stream()).forEach(System.out::println);
		
		/** LIST ALL THE EMPLOYEE's Managed by Bijo Jacob*/
		managerList.stream().filter(manager->manager.getName().equalsIgnoreCase("Bijo")).
		flatMap(manager->manager.getEmployeeList().stream()).forEach(System.out::println);

	}
}

class Manager {
	private String name;
	List<Emp> employeeList;

	public Manager(String name, List<Emp> employeeList) {
		super();
		this.name = name;
		this.employeeList = employeeList;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Emp> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Emp> employeeList) {
		this.employeeList = employeeList;
	}

}

class Emp {
	String firstName;
	String lastName;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Emp [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}