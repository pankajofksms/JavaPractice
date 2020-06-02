package com.practice.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class GetMinNumber {
	public static void main(String[] args) {
		int numbers[] = { 4, 6, 3, 7, 8, 2, 3, 4 };

		int min = IntStream.of(numbers).min().getAsInt();

		System.out.println("Min: " + min);
		IntStream.of(numbers).min().ifPresent((minNum) -> System.out.println("Min: " + minNum));

		IntSummaryStatistics intStatistics = IntStream.of(numbers).summaryStatistics();

		System.out.println("Average: " + intStatistics.getAverage());
		System.out.println("Max: " + intStatistics.getMax());
		System.out.println("Sum: " + intStatistics.getSum());
		System.out.println("Count: " + intStatistics.getCount());

		// Print 3 smallest distinct numbers
		IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::print);
		
		System.out.println("\n************************");
		
		get3HighestSalariedEmployee();
		
		System.out.println(collectNamesWith3HighestSal());
		
		
		

	}

	private static void get3HighestSalariedEmployee() {
		List<Employee> empList = intializeEmployee();
		
		empList.stream()
			   .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
			   .limit(3)
			   .map(emp -> emp.getName())
			   .forEach(System.out::println);

	}

	private static List<Employee> intializeEmployee() {
		Employee e1 = new Employee("Name1", 22, 50000);
		Employee e2 = new Employee("Name2", 22, 60000);
		Employee e3 = new Employee("Name3", 22, 40000);
		Employee e4 = new Employee("Name4", 22, 30000);
		Employee e5 = new Employee("Name5", 22, 90000);
		Employee e6 = new Employee("Name6", 22, 70000);
		Employee e7 = new Employee("Name7", 22, 80000);

		
		List<Employee> empList = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		return empList;
	}
	
	
	
	private static String collectNamesWith3HighestSal() {
		List<Employee> empList = intializeEmployee();
		
		String names = empList.stream()
			   .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
			   .limit(3)
			   .map(emp -> emp.getName())
			   .collect(Collectors.joining(","));
		
		return names;
	}
	
	
}
