package com.personal.upskill.java8.streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx16_Reduce1 {
	public static void main(String[] args) {

		OptionalInt sum = IntStream.rangeClosed(1, 10).reduce((a, b) -> a + b);
		System.out.println("SUM = " + sum.getAsInt());
	}
}
