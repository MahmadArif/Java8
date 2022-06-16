package com.personal.upskill.java8.constructorRef;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorRefEx1_ConstructorRef {

	public static void main(String[] args) {
		
	
		  
		
		  BiFunction<String, Integer, PermanentEmployee> employeeTwoArgs =
		  PermanentEmployee::new;
		  System.out.println("Employee Object ="+employeeTwoArgs.apply("Rajat", 30));
		 
		
	}
	
}
