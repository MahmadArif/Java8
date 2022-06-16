package com.personal.upskill.java8.methodRef;

import java.util.Arrays;
import java.util.List;

public class MethodRefEx4_MethodRef {
	public static void main(String[] args) {
		List<String> lstNames = Arrays.asList("Bijo","Rohit","Rajat","Arun","Karthik");
		lstNames.sort((n1,n2)->n1.compareTo(n2));
		
		lstNames.sort(String::compareTo);
		              
		
		
	}
}



