package com.personal.upskill.java8.lambda;

/**
 * Java 8 Session 2 Desc: Example use of "this" keyword in Anonymous Inner class in static
 * method 
 * 
 * @author
 *
 */
public class LambdaEx4_AnonymousInnerClassAndThisInStaticMethod {

	public static void main(String[] args) {
		Runnable workToBeDone = new Runnable() {
			public void run() {
				System.out.println(this);
				for (int i = 1; i <= 5; i++) {
					System.out.println("VALUE of i=" + i);
				}
			}
			
			@Override
			public String toString() {
				return "this = instance of INNER CLASS ";
			}
		};

		Thread thread = new Thread(workToBeDone);
		thread.start();
	}
	
	@Override
	public String toString() {
		return "this = instance of AnonymousInnerClassAndThis class ";
	}
}
