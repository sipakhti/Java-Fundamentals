package com.sipakhti;

import java.util.Arrays;

public class LearnArray {
    public static void main(String[] args) {
        int[] numbers = {2,3,5,1,4};
        System.out.println(numbers.length);
        java.util.Arrays.sort(numbers);
        System.out.println(java.util.Arrays.toString(numbers));

        // Multi Dimensional Array
        int[][] numbers2 = new int[2][3];
        int[][] numbers3 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbers3));

        // Constants are prefixed with the "final" key word. By convention, they are written in Capital letters.
        final float PI =  3.14F;

    }
}
