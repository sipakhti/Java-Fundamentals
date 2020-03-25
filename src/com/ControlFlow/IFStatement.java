package com.ControlFlow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IFStatement {
    public static void main(String[] args) {
        short temp = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter the temperature: ");
            try {
                temp = input.nextShort();
            } catch (InputMismatchException e) {
                System.out.println("Wrong temperature range!");
                continue;
            }
            if (temp > 30) {
                System.out.println("it's a hot day\nDrink plenty of water");
            } else if (temp > 20)
                System.out.println("It's a nice day");

            else
                System.out.println("It's cold");

            System.out.println("Enter q to exit: ");

        }while (!input.next().equalsIgnoreCase("q"));

//       TERNARY OPERATORS
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
    }
}
