package com.practice.udemy.in28minutes.part1;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        structuredList(List.of(3, 24, 5, 2, 4, 12, 6, 2, 12));
    }

    private static void structuredList(List<Integer> integers) {
        for(int number :integers){
            System.out.println(number);
        }
    }
}
