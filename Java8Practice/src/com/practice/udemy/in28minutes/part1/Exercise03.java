package com.practice.udemy.in28minutes.part1;

import java.util.List;

// Refer --> https://github.com/in28minutes/functional-programming-with-java/blob/master/exercises.md

public class Exercise03 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("------Exercise 7---------");
        findSumOfSquares(numbers);

        System.out.println("\n------Exercise 8---------");
        findSumOfCubes(numbers);

        System.out.println("\n------Exercise 9---------");
        findSumOfOddNumbers(numbers);

    }

    private static void findSumOfOddNumbers(List<Integer> numbers) {
        int sum = numbers.stream()
                .filter(num -> num % 2 == 1)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    private static void findSumOfCubes(List<Integer> numbers) {
        int sum = numbers.stream()
                .map(num -> num * num * num)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    private static void findSumOfSquares(List<Integer> numbers) {
        int sum = numbers.stream()
                .map(num -> num * num)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }

}
