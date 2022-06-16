package com.personal.upskill.java8.streams;

import java.util.stream.IntStream;

public class StreamEx12_PrimitiveStreamInt {

	public static void main(String[] args) {
		IntStream numberStream1 = IntStream.range(1, 11);
		IntStream numberStream2 = IntStream.rangeClosed(1, 10);

		System.out.println("******* Example with IntStream.range ***********");
		numberStream1.forEach(System.out::println);

		System.out.println("******* Example with IntStream.rangeClosed ***********");
		numberStream2.forEach(System.out::println);

	}

}
