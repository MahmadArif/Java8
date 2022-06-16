package com.personal.upskill.java8.streams;

import java.util.stream.Stream;

public class StreamEx11_CreateStreamFinite_Builder {
	public static void main(String[] args) {
		
		Stream<Person> personStream = Stream.<Person>builder()
															.add(new Person("Bijo"))
															.add(new Person("Karthik"))
															.add(new Person("Arun")).build();
		
		
		
		
	}
}

class Person{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
