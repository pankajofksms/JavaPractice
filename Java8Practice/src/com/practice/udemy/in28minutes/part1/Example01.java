package com.practice.udemy.in28minutes.part1;

import java.util.List;

public class Example01 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(32,43,564,32,8,5,3,10);
        //printAllNumbers(integers);
        printAllEvenNumbers(integers);



    }

    private static void printAllEvenNumbers(List<Integer> integers) {
        System.out.println("Print all even numbers");
        integers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printAllNumbers(List<Integer> integers) {
        System.out.println("Printing numbers in single line");
        integers.stream()
                .forEach(number -> System.out.println(number));
    }
}
