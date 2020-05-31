package com.practice.lambda;

import java.util.Arrays;

public class StringCustomComparator {
	
	public static void main(String[] args) {
		String[] words = {"Today", "is", "a", "sunny","day"};
		
		//Printing words based on length in increasing order. 
		
		Arrays.sort(words, (s1,s2) -> Integer.compare(s1.length(), s2.length()));
		
		System.out.println(Arrays.toString(words));
	}

}
