package com.personal.upskill.java8.streams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamEx14_PrimitiveStreamDouble {
	public static void main(String[] args) {
		Random random = new Random();
		DoubleStream doubleStream =  random.doubles(5);
		doubleStream.forEach(System.out::println);
		
		IntStream charStream =  "Bijo Jacob".chars();
		charStream.forEach(System.out::println);
	}
}
