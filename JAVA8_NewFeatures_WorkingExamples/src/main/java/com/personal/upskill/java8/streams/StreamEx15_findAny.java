package com.personal.upskill.java8.streams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx15_findAny {

	public static void main(String[] args) {
		
		IntStream intStream = IntStream.rangeClosed(1, 20);
		OptionalInt evenNumber = intStream.filter(number->number%2==0).findFirst();
		System.out.println("1st EVEN NUMBER = "+ evenNumber.getAsInt());
	
		IntStream intStream1 	= IntStream.rangeClosed(1, 20);
		OptionalInt evenNumber1 = intStream1.filter(number->number%2==0).findAny();
		System.out.println("1st EVEN NUMBER = "+ evenNumber1.getAsInt());
	}
}
