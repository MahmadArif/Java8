package com.personal.upskill.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx20_Collectors_Averaging {
	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
				new Employee("Karthik", 34), 
				new Employee("Arun", 25),
				new Employee("Joshi", 40));
		
		Double averageAgeofEmployee = employeeList.stream().collect(Collectors.averagingInt(Employee::getAge));
		System.out.println(averageAgeofEmployee);
	}
}
