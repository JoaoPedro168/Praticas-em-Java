package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputmismatch {
    public static void main(String[] args) {
        boolean condition = true;
        while(condition==true)
        try {
            System.out.print("Enter your prisoner number: ");
            Scanner scan = new Scanner(System.in);
            int name = scan.nextInt();
            System.out.println("Welcome " + name + " to prison");
            scan.close();
            condition=false;
        } catch (InputMismatchException ex) {
            System.out.println("Not a number scum!!!");
        }
    }
}
