package com.practice.pluralsightCourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class M3ListExample {

	public static void main(String[] args) {

		M1Person p1 = new M1Person("FirstName1", "LastName1", 20);
		M1Person p2 = new M1Person("FirstName2", "LastName2", 21);
		M1Person p3 = new M1Person("FirstName3", "LastName3", 22);
		M1Person p4 = new M1Person("FirstName4", "LastName4", 23);
		M1Person p5 = new M1Person("FirstName5", "LastName5", 24);
		M1Person p6 = new M1Person("FirstName6", "LastName6", 25);

		List<M1Person> people = new ArrayList(Arrays.asList(p1, p2, p3, p4, p5, p6));

		people.forEach(System.out::println);

		System.out.println("-------------------");

		people.removeIf((person) -> person.getAge() < 22);

		people.forEach(System.out::println);

		System.out.println("-------------------");

		people.replaceAll(person -> new M1Person(person.getFirstName().toUpperCase(),
				person.getLastName().toUpperCase(), person.getAge()));
		
		people.forEach(System.out::println);
		
		System.out.println("-------------------");
		
		people.sort(Comparator.comparing(M1Person::getAge).reversed());
		people.forEach(System.out::println);
	}


}
