package com.leetcode.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanjh
 * @date 2022/6/1 15:49
 */
public class fizzBuzz {
    public List<String> fizzBuzz(int n) {
        String result = "";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result = "FizzBuzz";
            } else if (i % 3 == 0) {
                result = "Fizz";
            } else if (i % 5 == 0) {
                result = "Buzz";
            } else {
                result = String.valueOf(i);
            }
            list.add(result);
        }
        return list;
    }

    public static void main(String[] args) {
        fizzBuzz fizzBuzz = new fizzBuzz();
        List<String> strings = fizzBuzz.fizzBuzz(15);
        System.out.println(strings);
    }
}
