package com.personal.upskill.java8.streams;

import java.util.stream.LongStream;

public class StreamEx13_PrimitiveStreamLong {

	public static void main(String[] args) {
		LongStream longStream1 = LongStream.range(1, 11);
		LongStream longStream2 = LongStream.rangeClosed(1,10);
		
		System.out.println("******* Example with IntStream.range ***********");
		longStream1.forEach(System.out::println);

		System.out.println("******* Example with IntStream.rangeClosed ***********");
		longStream2.forEach(System.out::println);

	}
	
}
