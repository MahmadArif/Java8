package com.personal.upskill.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx8_Collect {
	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("Bijo Jacob","Amit Kumar","Joshi Anthony","Karthik Ramanujar");
		nameList.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
		
	}
}
