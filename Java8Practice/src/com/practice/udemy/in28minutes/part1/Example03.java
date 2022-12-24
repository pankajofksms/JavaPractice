package com.practice.udemy.in28minutes.part1;

import java.util.List;

public class Example03 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(30,3,2,32,8,5,3,10);
        int sum = findSumOfList(integers);
        System.out.println(sum);

    }

    private static int findSumOfList(List<Integer> integers) {
        return integers.stream()
                .reduce(0, (a,b) ->  a+ b);

    }

}
