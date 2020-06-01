package com.practice.pluralsightCourse;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class M5_StreamPractice {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4, 5);

		Stream<Integer> stream1 = ints.stream();
		stream1.forEach(System.out::println);
		
		System.out.println("*********************");
		
		Stream<Integer> stream2 = Stream.of(0, 1, 2, 3, 4, 5);
		stream2.forEach(System.out::println);
		
		System.out.println("*********************");
		
		Stream<String> streamOfString = Stream.generate(() -> "one");	
		streamOfString.limit(5).forEach(System.out::println);
		
		System.out.println("*********************");
		
		Stream<String> streamOfString1 = Stream.iterate("-", s -> s + "+");
		streamOfString1.limit(5).forEach(System.out::println);
		
		System.out.println("*********************");
		
		IntStream intStream = ThreadLocalRandom.current().ints();
		intStream.limit(5).forEach(System.out::println);
		
		
	}
}
