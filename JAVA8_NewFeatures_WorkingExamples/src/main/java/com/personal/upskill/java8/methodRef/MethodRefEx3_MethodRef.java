package com.personal.upskill.java8.methodRef;

import java.util.function.Function;

public class MethodRefEx3_MethodRef {

	public static void main(String[] args) {
		Function<String,String> fntToUpper1 = s->s.toUpperCase();
		System.out.println(fntToUpper1.apply("Bijo"));
		
		Function<String,String> fntToUpper2 = String::toUpperCase;
		//Function<String,String> fntToUpper3 = new String()::toUpperCase;
		System.out.println(fntToUpper2.apply("Bijo"));
	}
}
