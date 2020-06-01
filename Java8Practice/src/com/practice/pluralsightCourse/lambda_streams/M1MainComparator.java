package com.practice.pluralsightCourse.lambda_streams;

import java.util.function.Function;

public class M1MainComparator {

	public static void main(String[] args) {
		M1Comparator<M1Person> cmpAge = (p1, p2) -> p1.getAge() - p2.getAge();
		M1Comparator<M1Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
		M1Comparator<M1Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());

		Function<M1Person, Integer> f1 = p -> p.getAge();
		Function<M1Person, String> f2 = p -> p.getFirstName();
		Function<M1Person, String> f3 = p -> p.getFirstName();

		M1Comparator<M1Person> cmpPersonAge = M1Comparator.comparing(M1Person::getAge);
		M1Comparator<M1Person> cmpPersonLastName = M1Comparator.comparing(M1Person::getAge);

		// compare age, if age same then compare lastName
		M1Comparator<M1Person> cmp = cmpPersonAge.thenComparing(cmpPersonLastName);

		M1Comparator<M1Person> cmpAll = M1Comparator.comparing(M1Person::getLastName)
									.thenComparing(M1Person::getFirstName)
									.thenComparing(M1Person::getAge);
	}

}
