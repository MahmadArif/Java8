package com.personal.upskill.java8.lambda;

/**
 * Java 8 Session 2 Desc: Example of how to create a Runnable with Anonymous
 * Inner class before lambda
 * 
 * @author
 *
 */

public class LambdaEx1_RunnableAnonymousInnerClass {

	public static void main(String[] args) {
		Runnable workToBeDone = new Runnable() {
			public void run() {
				
				System.out.println(this);
				
				for (int i = 1; i <= 5; i++) {
					//System.out.println("VALUE of i=" + i);
				}
			}
			
			@Override
			public String toString() {
				return "Runnable - to String";
			}
			
			
		};

		Thread thread = new Thread(workToBeDone);
		thread.start();
		}

	@Override
	public String toString() {
		return "RunnableAnonymousInnerClass - to String";
	}
	
	

}
