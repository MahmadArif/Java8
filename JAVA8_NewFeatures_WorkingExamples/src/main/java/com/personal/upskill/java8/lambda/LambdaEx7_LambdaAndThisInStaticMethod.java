package com.personal.upskill.java8.lambda;

/**
 * Java 8 Session 2 Desc: Example use of "this" keyword in lambda in static
 * method 
 * 
 * @author
 *
 */
public class LambdaEx7_LambdaAndThisInStaticMethod {
	public static void main(String[] args) {
		Runnable workToBeDone = () -> {
			/* Use OF this in a LAMBDA IN STATIC METHODS */
			/* System.out.println("this keyword ="+this); */
			for (int i = 1; i <= 50; i++) {
				System.out.println("VALUE of i=" + i);
			}
		};

		Thread thread = new Thread(workToBeDone);
		thread.start();
	}
}
