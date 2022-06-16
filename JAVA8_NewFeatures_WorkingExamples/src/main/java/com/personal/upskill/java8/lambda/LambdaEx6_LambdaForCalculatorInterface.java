package com.personal.upskill.java8.lambda;

/**
 * Java 8 Session 2 Desc: Example use of Custome Lambda Expression
 * @author
 *
 */
public class LambdaEx6_LambdaForCalculatorInterface {

	public static void main(String[] args) {
		LambdaEx6_CalculatorFunctionalInterface calculatorFunctional_Add      = (a,b)->a+b;
		LambdaEx6_CalculatorFunctionalInterface calculatorFunctional_Multiply = (a,b)->a*b;
		LambdaEx6_CalculatorFunctionalInterface calculatorFunctional_Subtract = (a,b)->a-b;
		
		System.out.println("20+10 ="+performCalCulatorFunction(20,10,calculatorFunctional_Add));
		System.out.println("20*10 ="+performCalCulatorFunction(20,10,calculatorFunctional_Multiply));
		System.out.println("20-10 ="+performCalCulatorFunction(20,10,calculatorFunctional_Subtract));
		
	}
	
	
	private static int performCalCulatorFunction(int number1,int number2, LambdaEx6_CalculatorFunctionalInterface calculatorFunctional) {
		return calculatorFunctional.compute(number1, number2);
	}
	
}
