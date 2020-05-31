package com.practice.lambda.pluralsightAssigment;

import java.util.ArrayList;
import java.util.List;

//A simple program to print list of integers in seperate line

public class BasicListPrinting {

	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();

		integerList.add(1);
		integerList.add(2);
		integerList.add(3);

		integerList.forEach(System.out::println);
		
		System.out.println("\n***** Another way to do the same ****" +'\n');
		
		integerList.forEach(item -> System.out.println(item));
		
		System.out.println("\n***** Print square of each number ****" +'\n');
		
		integerList.forEach(item -> System.out.println(item*item));
	}

}
