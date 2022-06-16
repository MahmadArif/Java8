package com.personal.upskill.java8.lambda;

/**
 * Java 8 Session 2 Desc: Example use of "this" keyword in Anonymous Inner class in instance
 * method 
 * 
 * @author
 *
 */
public class LambdaEx3AnonumousInnerClassAndThisInInstanceMethod {
	
void createThread() {
	System.out.println(this);	
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

	public static void main(String[] args) {
		new LambdaEx3AnonumousInnerClassAndThisInInstanceMethod().createThread();
	}
	
	@Override
	public String toString() {
		return "this = instance of AnonumousInnerSlassAndThisInInstanceMethod class ";
	}
}
