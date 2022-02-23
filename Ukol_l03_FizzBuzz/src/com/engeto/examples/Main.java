package com.engeto.examples;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 101; i++) {

            String greeting;
            if ((i % 3 == 0) && (i % 5 ==0)){
                greeting = "FizzBuzz";
                System.out.println(greeting);
            } else if (i % 3 == 0) {
                greeting = "Fizz";
                System.out.println(greeting);
            } else if (i % 5 == 0)  {
                greeting = "Buzz";
                System.out.println(greeting);
            } else {
                System.out.println(i);
            }
        }
    }
}







