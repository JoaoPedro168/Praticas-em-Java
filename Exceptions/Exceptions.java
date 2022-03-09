package Exceptions;

import java.util.Scanner;

/**
 * Exceptions
 */
public class Exceptions {

    public static double getQuotient(Double num1, Double num2) {
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        boolean condition = true;
       
        while (condition == true) {
            Scanner scan = new Scanner(System.in);
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();
            
            try {
                System.out.println(getQuotient(num1, num2));
                condition=false;
                scan.close();
            } catch (ArithmeticException e) {
                System.out.println("Number cannot be divided by zero");
                System.out.println("Try again");
            }
        }
        
    }
}