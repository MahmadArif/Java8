package com.personal.upskill.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx18_Reduce3 {
	public static void main(String[] args) {
		List<Integer> numberLst = Arrays.asList(1,2,3);
		int sum = numberLst.parallelStream().reduce(10, (a,b)->a+b,(a,b)->a+b);
		System.out.println(sum);
	}
}
