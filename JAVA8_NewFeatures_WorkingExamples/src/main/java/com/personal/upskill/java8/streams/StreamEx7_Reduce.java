package com.personal.upskill.java8.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx7_Reduce {
	public static void main(String[] args) {
		IntStream numberStream =  IntStream.range(1, 11);
		System.out.println("Sum of numbers from 1 to 10 = "+numberStream.reduce(0, (a,b)->a+b));
	}
}
