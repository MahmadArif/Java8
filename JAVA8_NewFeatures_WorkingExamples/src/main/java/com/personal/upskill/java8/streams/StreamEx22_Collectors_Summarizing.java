package com.personal.upskill.java8.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx22_Collectors_Summarizing {
	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
				new Employee("Karthik", 34), 
				new Employee("Arun", 25),
				new Employee("Joshi", 40));
		
		IntSummaryStatistics stat =  employeeList.stream().collect(Collectors.summarizingInt(Employee::getAge));
		System.out.println(stat);
		System.out.println(stat.getCount());
		
	}
}
