package com.personal.upskill.java8.methodRef;

import java.util.function.BiFunction;

public class MethodRefEx1_MethodRef {

	public static void main(String[] args) {
		
		  BiFunction<String, Integer, String> subString1 =	  (str,index)->str.substring(index);
		  System.out.println(subString1.apply("Rajat Jain", 5));
		 
		  BiFunction<String, Integer, String> subString2 = String::substring;
		  System.out.println(subString2.apply("Bijo Jacob", 5));
		 
		
	}
	
}
