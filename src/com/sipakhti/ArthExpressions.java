package com.sipakhti;

public class ArthExpressions {
    public static void main(String[] args) {
        int result = 10 + 3;
        System.out.println(result);
        result = 10 - 3;
        System.out.println(result);
        result = 10 * 3;
        System.out.println(result);
        result = 10 / 3;
        // the result of division in Java is a whole number so 10/3 will give 3.
        System.out.println(result);
        // if we want to get the closest possible answer then we need to cast the expression to either float or double.
        double results = (double)10 / (double)3;
        System.out.println(results);

    }
}
