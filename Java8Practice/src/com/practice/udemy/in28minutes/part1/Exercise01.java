package com.practice.udemy.in28minutes.part1;

import java.util.List;

// Refer --> https://github.com/in28minutes/functional-programming-with-java/blob/master/exercises.md
// Exercise 1-4
public class Exercise01 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 2, 6, 8, 3, 99);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        System.out.println("------Exercise 1---------");
        printOddNumbers(numbers);

        System.out.println("\n------Exercise 2---------");
        printCourses(courses);

        System.out.println("------Exercise 3---------");
        printCoursesWithSpringWord(courses);

        System.out.println("------Exercise 4---------");
        printCoursesWithMin4Length(courses);
    }

    private static void printCoursesWithMin4Length(List<String> courses) {
        courses.stream()
                .filter(word -> word.length()>=4)
                .forEach(System.out::println);
    }

    private static void printCoursesWithSpringWord(List<String> courses) {
        courses.stream()
                .filter(word -> word.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printCourses(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }


}
