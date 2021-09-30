package com.practice.udemy.in28minutes;

import java.util.List;

public class F01Functional {
    public static void main(String[] args) {
        functionalList(List.of(3, 24, 5, 2, 4, 12, 6, 2, 12));
    }

    private static void functionalList(List<Integer> integers) {
        integers.stream().forEach(F01Functional::print); //Method Reference
    }

    private static void print(Integer integer) {
        System.out.println(integer);
    }


}
