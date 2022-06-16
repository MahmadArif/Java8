package com.personal.upskill.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx19_Collectors_toList {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(new Employee("Karthik", 34),new Employee("Arun", 25),new Employee("Joshi", 40));
		employeeList.stream().map(Employee::getName).collect(Collectors.toList()).forEach(System.out::println);
		
	}
}


