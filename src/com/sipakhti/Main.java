package com.sipakhti;

import java.awt.*;
import java.io.PrintStream;
import java.util.Date;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        // Primitive type
        long age = 3_301_123_546L;

        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        // Reference type
        Date now = new Date();
        String name = "Umer";
        out.println(now);
        out.println(age);
        // memory managment
        byte x = 1;
        byte y = x;
        x = 2;
        out.println(y);
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 10;
        point2.y = 100;
        out.println(point2);
        // Strings
        // Strings are reference types in Java but due to its ubiquitous nature this a shorter method to initialize the object directly
        String message = "Hello World"+"!!";
        out.println(message.endsWith("!!"));
        out.println( message.indent(4));
        out.println(message.toUpperCase());
        out.println(message.toLowerCase());
        out.println(message.substring(3,8));
        out.println(message.charAt(5));
        out.println(message.chars());
        out.println(message.indexOf(5));
        out.println(message.indexOf('W'));
        out.println(message.indexOf("Wor"));
        out.println(message.intern());
        out.println(message.length());
        out.println(message.lines());
        out.println(message.matches("l"));
        for (int i = 0; i < message.split(" ").length; i++) {
            out.println(message.split(" ")[i]);
        }
        for (String s : message.split(" ")) {
            out.println(s);
        }



    }
}