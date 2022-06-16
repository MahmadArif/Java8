package com.personal.upskill.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;
/**
 * Java 8 Session 2 Desc: Example use of Comparator with Lambda
 *  
 * 
 * @author
 *
 */
public class LambdaEx9_ComparatorLambdaExample {
	public static void main(String[] args) {
		
		   List<Employee> empLst = Arrays.asList(new Employee("Rajat", 36), new Employee("George", 33),new   Employee("Shajan", 43));
		   Comparator<Employee> employeeSortByNameComparator = 
		   (emp1,emp2)->{
			    return emp1.getName().compareTo(emp2.getName());
		   };
		   
			
		   	System.out.println("*******BEFOR SORTING*********");
			empLst.forEach(System.out::println);
			Collections.sort(empLst,employeeSortByNameComparator);
			System.out.println("*******AFTER SORTING*********");
			
			Consumer<Employee> employeeConSumer = emp->System.out.println(emp.getName());
			
			empLst.forEach(e->System.out.println(e.getName()));
			empLst.forEach(employeeConSumer);
			
			empLst.forEach(System.out::println);
			
			
		
	}
}
