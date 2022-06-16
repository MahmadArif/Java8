package com.personal.upskill.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamEx5_Map {
	public static void main(String[] args) {
		List<String> namesList = Arrays.asList("Karthik", "Joshi", "Arun", "Bijo");
		namesList.stream().map(REmp::new).forEach(System.out::println);
	}
}

class REmp {
	String name;

	public REmp(String name) {
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
		return "RenaultEmp [name=" + name + "]";
	}

}
