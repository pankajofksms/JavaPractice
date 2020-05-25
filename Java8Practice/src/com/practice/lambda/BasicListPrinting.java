package com.practice.lambda;

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
	}

}
