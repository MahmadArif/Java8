package com.personal.upskill.java8.lambda;

/**
 * Java 8 Session 2 Desc: Example of how to create a Runnable with Lambda
 * @author
 *
 */
public class LambdaEx2_RunnableLambdaExample {

	public static void main(String[] args) {
		Runnable workToBeDone = () -> {
			int a=10;
			for (int i = 1; i <= 50; i++) {
				System.out.println("VALUE of i=" + i);
				
			}
		};

		Thread thread = new Thread(workToBeDone);
		thread.start();
	}
}
