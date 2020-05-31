package com.practice.pluralsightCourse;

public class M2FunctionMain {

	public static void main(String[] args) {
		M2Predicate<String> lengthGT20 = (s) -> s.length() > 20;
		System.out.println(lengthGT20.test("Pankaj Kumar"));
		System.out.println(lengthGT20.test("My name is Pankaj Kumar"));

		M2Predicate<String> p1 = (s) -> s.length() < 20;
		M2Predicate<String> p2 = (s) -> s.length() > 5;

		System.out.println("------------------------");

		M2Predicate<String> p3 = p1.and(p2);

		System.out.println(p3.test("Pank"));
		System.out.println(p3.test("Pankaj Kumar"));
		System.out.println(p3.test("My name is Pankaj Kumar"));

		System.out.println("------------------------");

		M2Predicate<String> p4 = p1.or(p2);

		System.out.println(p4.test("Pank"));
		System.out.println(p4.test("Pankaj Kumar"));
		System.out.println(p4.test("My name is Pankaj Kumar"));
		
		System.out.println("------------------------");

		M2Predicate<String> p5 = M2Predicate.equalsTo("Pankaj");

		System.out.println(p5.test("Pankaj"));
		System.out.println(p5.test("Pankaj Kumar"));
		
		System.out.println("------------------------");
		// This will work since equalsTo will autobox 1 to Integer wrapper class
		M2Predicate<Integer> p6 = M2Predicate.equalsTo(1);
		
		System.out.println(p6.test(1));
		System.out.println(p6.test(2));
		

	}
}
