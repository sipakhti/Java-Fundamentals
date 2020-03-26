package com.Experimentations;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;




public class Calculator {
    /** Takes a user string and parses it to do basic arithmetic calculations.
     *
      * @param input : String
     * @return String
     */



    public static String ArthOp(String input) {

        int divideCount = 0, multiplyCount = 0, addCount = 0, subtractCount = 0;


        // to check which operation is required
        for (int i = 0; i < input.toCharArray().length; i++) {
            switch (input.toCharArray()[i]) {
                case '/':
                    divideCount++;
                    continue;
                case '*':
                    multiplyCount++;
                    continue;
                case '+':
                    addCount++;
                    continue;
                case '-':
                    subtractCount++;
                    continue;
                default:

            }


        }
        for (int i = 0; i < divideCount; i++)
            input = isDivide(input);

        for (int i = 0; i < multiplyCount; i++)
            input = isMultiply(input);

        for (int i = 0; i < addCount; i++)
            input = isAdd(input);
        for (int i = 0; i < subtractCount; i++)
            input = isSubtract(input);



    return input;
    }



    public static void main(String arg) {


        if (arg == null) {
            Scanner test = new Scanner(System.in);
            arg = test.nextLine();
        }
        System.out.println(ArthOp(arg));

    }

    static String isDivide(String input) {
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
                        if (arr[j] == '+' || arr[j] == '-' || arr[j] == '*' || arr[j] == '/'){
                            if (i-j == 2) {
                                j++;
                            }
                            break;
                        }

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
                        // if the last number in a single digit
                        if (j-i == 1) {
                            num2 = input.substring(i+1);
                            sub = num1 + "/" + num2;
                            divide = Long.parseLong(num1)/Long.parseLong(num2);
                            input = input.replace(sub,Long.toString(divide));
                            return input;
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
        return input;
    }

    static String isMultiply(String input){
        char[] arr = input.toCharArray();
        String num1 , num2, sub ;

        long  product = 0;
        int j;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '*'){
                j = i;
                // while loop to iterate back and to the previous operator to parse the number
                while (true) {
                    j--;

                    try {
                        if (arr[j] == '+' || arr[j] == '-' || arr[j] == '*' || arr[j] == '/')
                            break;
                    }catch (ArrayIndexOutOfBoundsException e) {
                        j++;

                        break;
                    }
                }

                num1 = input.substring(j+1,i);


                j = i;
                // while loop to iterate forward to the next operator
                while (true) {
                    j++;
                    try {
                        if (arr[j] == '+' || arr[j] == '-' || arr[j] == '*' || arr[j] == '/')
                            break;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        j--;
                        // if the last number is a single digit
                        if (j-i == 1) {
                            num2 = input.substring(i+1);
                            sub = num1 + "*" + num2;
                            product = Long.parseLong(num1)*Long.parseLong(num2);
                            input = input.replace(sub,Long.toString(product));
                            return input;
                        }
                        break;
                    }
                }


                num2 = input.substring(i+1,j);
                product = Integer.parseInt(num1)*Integer.parseInt(num2);
                sub = num1 + "*" + num2;
                input = input.replace(sub,Long.toString(product));
            }

            if (product > 0)
                break;

        }


        return input;
    }

    static String isAdd(String input) {
        char[] arr = input.toCharArray();
        String num1, num2, sub;
        long sum = 0;
        int j;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '+') {
                j = i;
                // while loop to iterate back and to the previous operator to parse the number
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
                // while loop to iterate forward to the next operator
                while (true) {
                    j++;
                    try {
                        if (arr[j] == '+' || arr[j] == '-' || arr[j] == '*' || arr[j] == '/')
                            break;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        num2 = input.substring(i+1);
                        sub = num1 + "+" + num2;
                        sum = Long.parseLong(num1) + Long.parseLong(num2);
                        input = input.replace(sub,Long.toString(sum));

                        return input;
                    }
                }
                num2 = input.substring(i+1,j);
                sub = num1 + "+" + num2;
                sum = Long.parseLong(num1) + Long.parseLong(num2);
                input = input.replace(sub,Long.toString(sum));


            }


        }
        return input;
    }

    static String isSubtract(String input) {
        char[] arr = input.toCharArray();
        String num1, num2, sub;
        long sum = 0;
        int j;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '-') {
                j = i;
                // while loop to iterate back and to the previous operator to parse the number
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
                // while loop to iterate forward to the next operator
                while (true) {
                    j++;
                    try {
                        if (arr[j] == '+' || arr[j] == '-' || arr[j] == '*' || arr[j] == '/')
                            break;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        num2 = input.substring(i+1);
                        sub = num1 + "-" + num2;
                        sum = Long.parseLong(num1) - Long.parseLong(num2);
                        input = input.replace(sub,Long.toString(sum));

                        return input;
                    }
                }
                num2 = input.substring(i+1,j);
                sub = num1 + "-" + num2;
                sum = Long.parseLong(num1) - Long.parseLong(num2);
                input = input.replace(sub,Long.toString(sum));


            }


        }
        return input;

    }
}



