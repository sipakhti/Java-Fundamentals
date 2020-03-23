package com.sipakhti;

import javax.swing.*;

public class Casting {
    public static void main(String[] args) {
        // implicit casting
        // byte > short > int > long > float > double
        // only happens when no data loss occurs. lower bytes or lower precision numbers can be casted automatically to higher bytes or higher precision type
        short x = 1;
        int y = x +2;
        // explicit casting
        double a = 1.1;
        int b = (int)a + 2;
        // cannot cast a string to a number (non-compatible) so we use wrapper class
        String s = "i1c";
        try {
            int c = Integer.parseInt(s) + 2;
            System.out.println(c);
        } catch (NumberFormatException e) {
            System.out.println("Wrong Input");;
        }




    }
}
