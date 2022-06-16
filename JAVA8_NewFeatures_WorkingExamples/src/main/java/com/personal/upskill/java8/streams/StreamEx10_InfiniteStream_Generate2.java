package com.personal.upskill.java8.streams;

import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamEx10_InfiniteStream_Generate2 {
	public static void main(String[] args) {

		Supplier<UUID> uuidSupplier = UUID::randomUUID;
		Stream<UUID> uuidStream = Stream.generate(uuidSupplier);
		uuidStream.limit(5).forEach(System.out::println);

	}
}

