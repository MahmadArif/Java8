package com.personal.upskill.java8.methodRef;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class MethodRefEx5_MethodRef {
	public static void main(String[] args) {
		List<String> lstNames = Arrays.asList("Bijo", "Rohit", "Rajat", "Arun", "Karthik");
		BiPredicate<List<String>, String> lstContainsFnt = (lst, str) -> lst.contains(str);
		System.out.println(lstContainsFnt.test(lstNames, "Bijo"));

		BiPredicate<List<String>, String> lstContainsFnt1 = List::contains;
		System.out.println(lstContainsFnt1.test(lstNames, "Bijo"));

	}
}
