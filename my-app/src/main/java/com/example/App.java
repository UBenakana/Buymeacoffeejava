package com.example;

import com.example.util.StringUtils;

public class App {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = StringUtils.reverse(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
