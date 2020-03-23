package com.sipakhti;

import java.text.NumberFormat;

public class LearnMath {
    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result);
        // returns the smallest whole number greater than the value
        int result_1 = (int)Math.ceil(1.1F);
        System.out.println(result_1);
        // returns the largest whole number smaller than the value
        int result_2 = (int)Math.floor(1.1F);
        // Math.random() generates a number between 0-1
        byte result_3 = (byte)Math.round(Math.random() * 100);
        System.out.println(result_3);

        // formatting Numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String test = currency.format(1234567.891);
        System.out.println(test);
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println(percent);
        // Method Chaining
        test = NumberFormat.getPercentInstance().format(0.5);
        System.out.println(test);


    }
}
