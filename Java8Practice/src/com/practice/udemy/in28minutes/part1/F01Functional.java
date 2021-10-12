package com.practice.udemy.in28minutes.part1;

import java.util.List;

public class F01Functional {
    public static void main(String[] args) {
        List<Integer> integers = List.of(3, 24, 5, 2, 4, 12, 6, 2, 12);
        functionalList(integers);
        System.out.println("---Even List----");
        printEvenList(integers);
    }

    private static void printEvenList(List<Integer> integers) {
        integers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }

    private static void functionalList(List<Integer> integers) {
        integers.stream().forEach(F01Functional::print); //Method Reference
    }

    private static void print(Integer integer) {
        System.out.println(integer);
    }


}
