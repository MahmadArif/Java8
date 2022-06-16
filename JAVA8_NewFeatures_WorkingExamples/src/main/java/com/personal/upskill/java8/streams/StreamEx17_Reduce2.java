package com.personal.upskill.java8.streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx17_Reduce2 {

	public static void main(String[] args) {
		int sum =  IntStream.rangeClosed(1, 10).reduce(10, (a,b)->a+b);
		System.out.println("SUM ="+sum);
	}
	
}
