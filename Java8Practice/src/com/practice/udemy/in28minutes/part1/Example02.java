package com.practice.udemy.in28minutes.part1;

import java.util.List;

public class Example02 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(32,43,564,32,8,5,3,10);
        printSquaresOfEvenNumbers(integers);

    }

    private static void printSquaresOfEvenNumbers(List<Integer> integers) {
        integers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }


}
