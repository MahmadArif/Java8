package com.personal.upskill.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Java 8 Session 2 Desc: Closure Example
 * 
 * @author
 *
 */
public class LambdaEx11_ClosuresExample {

	public static void primeFactor() {
		List<Integer> lstNumbers = Arrays.asList(1,2,3,4,5,6);
		int divideBy = 2;
		
		/* divideBy = 30; */
		lstNumbers.forEach(numbers -> {
			//divideBy  = 30;
			//int no = numbers/divideBy ; 
			//divideBy  = 30;
			}); 
		
		divideBy  = 30;
		
	}
	
	public void sampleMethod() {
		for (int i = 0; i < 10; i++) {
			Consumer<Integer> consume = (o)->{
				
				//System.out.println("I VALUE ="+i);// Local variable i defined in an enclosing scope must be final or effectively final
			};
		}
	}
	
	public void lambdaRules(int first1) {

		int first = 0;
		Comparator<String> comp = (first2, second) -> first2.length() - second.length();
	}
	
}
