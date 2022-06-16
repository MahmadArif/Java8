package com.personal.upskill.java8.lambda;


/**
 * Java 8 Session 2 Desc: Example use of "this" keyword in lambda in instance
 * method 
 * 
 * @author
 *
 */
public class LambdaEx8_LambdaAndThisInInstanceMethod {

	void createThread() {
		
		Runnable workToBeDone = () -> {
			/* Use OF this in a LAMBDA IN Instance METHODS */
			System.out.println(this); 
			for (int i = 1; i <= 5; i++) {
				//System.out.println("VALUE of i=" + i);
			}
		};

		Thread thread = new Thread(workToBeDone);
		thread.start();
	}
	
	public static void main(String[] args) {
		new LambdaEx8_LambdaAndThisInInstanceMethod().createThread();
	}

	@Override
	public String toString() {
		return "this = instance of LambdaAndThisInInstanceMethod class ";
	}
	
	
}
