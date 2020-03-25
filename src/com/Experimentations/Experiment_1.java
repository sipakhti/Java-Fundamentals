package com.Experimentations;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;




public class Experiment_1<num3> {

    static String input;

    static long isAdd(){
        char[] arr = Experiment_1.input.toCharArray();
        int to_sum[] = {};
        int sum = 0;
        int j;
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '+'){
                j = i;
                // while loop to iterate back and to the previous operator to parse the number
                while (true) {
                    j--;
                    n = 1;
                    try {
                        if (arr[j] == '+' || arr[j] == '-' || arr[j] == '*' || arr[j] == '/')
                            break;
                    }catch (ArrayIndexOutOfBoundsException e) {
                        j++;
                        n = 0;
                        break;
                    }
                }
                to_sum = addX(to_sum,Integer.parseInt(Experiment_1.input.substring(j+n,i)));
                j = i;
                // while loop to iterate forward to the next operator
                while (true) {
                    j++;
                    try {
                        if (arr[j] == '+' || arr[j] == '-' || arr[j] == '*' || arr[j] == '/')
                            break;
                    } catch (ArrayIndexOutOfBoundsException e){
                        break;
                    }
                }
                to_sum = addX(to_sum,Integer.parseInt(Experiment_1.input.substring(i+1,j)));

            }
        }
        for (int i : to_sum) {
            sum += i;
        }
        return sum;
    }

    public static long ArthOp() {


        char splitter = ' ';
        long answer = -1;
        boolean add = false;//modulus =false, power = false;
        int divideCount = 0, multiplyCount = 0;
        int test = Experiment_1.input.toCharArray().length;

        // to check which operation is required
        for (int i = 0; i < Experiment_1.input.toCharArray().length; i++) {
            switch (Experiment_1.input.toCharArray()[i]) {
                case '/':
                    divideCount++;
                    //divide = true;
                    continue;
                case '*':
                    multiplyCount++;
                    //multiply = true;
                    continue;
                case '+':

                    add = true;
                    continue;
                case '-':
//
                    continue;
//                case '%':
//                    modulus = true;
//                    break;
//                case '^':
//                    power = true;
//                    break;
                default:
                    continue;
            }
            // to save the symbol in a variable to use as a an argument for .split() method
//            if (add || subtract || multiply || divide )// modulus || power)
//                splitter = Experiment_1.input.toCharArray()[i];
//                break;

        }
        for (int i = 0; i < divideCount; i++) {
            isDivide();
        }
        for (int i = 0; i < multiplyCount; i++) {
            isMultiply();
        }

        if (add) {
            answer = 0;
            // "+" is a reserved symbol in Regex
            for (String s : Experiment_1.input.split("\\+")) {
                try {
                    answer += Integer.parseInt(s);
                }catch (NumberFormatException e){
                    System.out.println(Experiment_1.input);
                }
            }

        }
//        else if (subtract) {
//            answer = Integer.parseInt(Experiment_1.input.split(String.valueOf(splitter))[0]);
//            for (int i = 1; i < Experiment_1.input.split(String.valueOf(splitter)).length; i++) {
//                answer -= Integer.parseInt(Experiment_1.input.split(String.valueOf(splitter))[i]);
//            }
//        }
//        // Multiplication
//        else if (multiply) {
//            answer = 1;
//            // "*" is a reserved symbol in Regex
//            for (String s : Experiment_1.input.split("\\*")) {
//                answer *= Integer.parseInt(s);
//            }
//        }
//        // Division Operation
//        else if (divide)
//            answer = Integer.parseInt(Experiment_1.input.split(String.valueOf(splitter))[0]) / Integer.parseInt(Experiment_1.input.split(String.valueOf(splitter))[1]);

        // Modulo Operation
//        else if (modulus)
//            answer = Integer.parseInt(input.split(String.valueOf(splitter))[0]) % Integer.parseInt(input.split(String.valueOf(splitter))[1]);
//
//        else if (power) {
//            // "^" is a reserved symbol in Regex
//            // to make the code less redundant
//            String[] test_array = input.split(String.valueOf("\\^"));
//            // the save the last value of the string array so that reverse iteration is possible
//            long pwr = Integer.parseInt(input.split(String.valueOf("\\^"))[test_array.length-1]);
//            // the actual loop that iterates over the string solving the equation from left to right
//            for (int i = test_array.length-1; i > 0 ; i--) {
//                answer = (long) Math.pow(Integer.parseInt(test_array[i-1]),pwr);
//                pwr = answer;
//            }
//        }

    return answer;
    }


    static int[] addX(int arr[],int x){

        int n = arr.length;
        int newarray[] = new int[n+1];

        for (int i = 0; i < n; i++)
            try{
            newarray[i] = arr[i];
            }catch (ArrayIndexOutOfBoundsException e){
                break;
            }

        newarray[n] = x;

        return newarray;
    }

    public static void main(String[] args) {

        Scanner test = new Scanner(System.in);
        Experiment_1.input = test.nextLine();
        System.out.println(ArthOp());

    }

    static void isMultiply(){
        char[] arr = Experiment_1.input.toCharArray();
        String num1="" , num2="", sub="" ;

        long product = 1, num3 = 0;
        int j;
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            num3 = 0;
            if (arr[i] == '*'){
                j = i;
                // while loop to iterate back and to the previous operator to parse the number
                while (true) {
                    j--;
                    n = 1;
                    try {
                        if (arr[j] == '+' || arr[j] == '-' || arr[j] == '*' || arr[j] == '/')
                            break;
                    }catch (ArrayIndexOutOfBoundsException e) {
                        j++;
                        n = 0;
                        break;
                    }
                }

                num1 = input.substring(j+n,i);


                j = i;
                // while loop to iterate forward to the next operator
                while (true) {
                    j++;
                    try {
                        if (arr[j] == '+' || arr[j] == '-' || arr[j] == '*' || arr[j] == '/')
                            break;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        j--;
                        if (j-i == 1) {
                            num2 = input.substring(i+1);
                            sub = num1 + "*" + num2;
                            num3 = Long.parseLong(num1)*Long.parseLong(num2);
                            input = input.replace(sub,Long.toString(num3));
                            return;
                        }
                        break;
                    }
                }


                num2 = input.substring(i+1,j);


                num3 = Integer.parseInt(num1)*Integer.parseInt(num2);
                sub = num1 + "*" + num2;
                input = Experiment_1.input.replace(sub,Long.toString(num3));
            }

            if (num3 > 0)
                break;

        }



    }

    static long isDivide() {
        char[] arr = input.toCharArray();
        long divide = 0;
        int j = 0;
        String num1 , num2 ;
        String sub;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '/') {
                j = i;
                while (true) {
                    j--;
                    try {
                        if (arr[j] == '+' || arr[j] == '-' || arr[j] == '*' || arr[j] == '/')
                            break;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        j++;
                        break;
                    }
                }
                num1 = input.substring(j,i);

                j = i;
                while (true) {
                    j++;
                    try {
                        if (arr[j] == '+' || arr[j] == '-' || arr[j] == '*' || arr[j] == '/')
                            break;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        j--;
                        if (j-i == 1) {
                            num2 = input.substring(i+1);
                            sub = num1 + "/" + num2;
                            divide = Long.parseLong(num1)/Long.parseLong(num2);
                            input = input.replace(sub,Long.toString(divide));
                            return 0;
                        }
                        break;
                    }
                }
                num2 = input.substring(i+1,j);
                sub = num1 + "/" + num2;
                divide = Long.parseLong(num1)/Long.parseLong(num2);
                input = input.replace(sub,Long.toString(divide));

            }


        }
        return divide;
    }
}



