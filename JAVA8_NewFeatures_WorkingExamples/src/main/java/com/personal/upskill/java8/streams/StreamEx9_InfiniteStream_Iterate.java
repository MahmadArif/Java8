package com.personal.upskill.java8.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx9_InfiniteStream_Iterate {
	public static void main(String[] args) {
			Stream.iterate(0, i->i+2).limit(10).collect(Collectors.toList()).forEach(System.out::println);
	}
}
