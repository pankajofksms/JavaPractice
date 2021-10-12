package com.practice.udemy.in28minutes.part1;

import java.util.List;

public class Exercise02 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        System.out.println("------Exercise 5---------");
        printCubesOfOddNumbers(numbers);

        System.out.println("\n------Exercise 6---------");
        printNumberOfCharacters(courses);
    }

    private static void printCubesOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num % 2 == 1)
                .map(num -> num * num * num)
                .forEach(System.out::println);
    }

    private static void printNumberOfCharacters(List<String> courses) {
        courses.stream()
                .map(course -> course + " --> " + course.length())
                .forEach(System.out::println);
    }
}
