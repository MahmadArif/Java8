package com.personal.upskill.java8.methodRef;

import java.util.function.Consumer;

public class MethodRefEx2_MethodRef {
	public static void main(String[] args) {
		Consumer<String> consume1 = (str)->System.out.println(str);
		consume1.accept("HELLO Mr. Bijo");
		
		Consumer<String> consume2 = System.out::println;
		consume2.accept("HELLO Mr. Bijo");
		
	}
}
