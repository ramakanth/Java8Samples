package com.java8.preffuncinterface;

import java.util.function.BiFunction;

public class PredefinedFuncInterfaces {
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> byFunc = (a, b)-> a+b;
		System.out.println(byFunc.apply(10, 20));
	}

}
