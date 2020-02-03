package com.java8.funcmethods;

import java.util.function.BiFunction;

public class CalculatorTest {
	public static void main(String[] args) {
		
	    BiFunction<Integer, Integer, Integer> addFunc = (a, b) -> a + b;
	    BiFunction<Integer, Integer, Integer> subFunc = (a, b) -> a - b;
	    BiFunction<Integer, Integer, Integer> mulFunc = (a, b) -> a * b;
	    BiFunction<Integer, Integer, Integer> divFunc = (a, b) -> a / b;
	    
	    int add = addFunc.apply(20 , 10);
	    int sub = subFunc.apply(20 , 10);
	    int mul = mulFunc.apply(20 , 10);
	    int div = divFunc.apply(20 , 10);
	    
	    System.out.println("Add : "+ add);
	    System.out.println("Sub : " + sub);
	    System.out.println("Mul : "+ mul);
	    System.out.println("Div : "+div);
	}

}
