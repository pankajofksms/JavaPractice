package com.practice.pluralsightCourse;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class M4MainReduction {
	
	public static int reduce(List<Integer> values,int valueIfEmpty, BinaryOperator<Integer> reduction) {
		int result = valueIfEmpty;
		
		for(int value: values) {
			result = reduction.apply(result, value);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer> int1 = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		List<Integer> int2 = Arrays.asList(0,1,2,3,4);
		List<Integer> int3 = Arrays.asList(5,6,7,8,9);
		
		BinaryOperator<Integer> op = (param1, param2) -> param1+param2;
		int reduction = reduce(int1, 0, op);
		
		System.out.println("Result: "+ reduction);
		
		
	}
}
