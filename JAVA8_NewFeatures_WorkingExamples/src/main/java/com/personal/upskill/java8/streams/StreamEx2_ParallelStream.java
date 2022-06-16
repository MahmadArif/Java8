package com.personal.upskill.java8.streams;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class StreamEx2_ParallelStream {

	public static void main(String[] args) {
		List<Session> sessionList = Arrays.asList(new Session("JAVA 8", "session01"),
				  new Session("GIT", "session02"),
				  new Session("SpringBoot", "session03"));
		System.out.println("******** PARALLEL STREAM ***********");
		Instant startTime = Instant.now();
		sessionList.parallelStream().forEach(System.out::println);
		Instant endTime = Instant.now();
		System.out.println(Duration.between(startTime, endTime).toMillis());
	
		System.out.println("******** NON-PARALLEL STREAM ***********");
		Instant startTime2 = Instant.now();
		sessionList.stream().forEach(System.out::println);
		Instant endTime2 = Instant.now();
		System.out.println(Duration.between(startTime2, endTime2).toMillis());
		
	
	}
}
