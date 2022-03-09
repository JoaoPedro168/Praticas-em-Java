package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExceptionsTrials {
    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner scan = new Scanner(createFile());
        while(scan.hasNext()){
            int score=scan.nextInt();
            String player= scan.next();
            System.out.println("The name of the player is: " + player);
            System.out.println("The score of the players was: " + score);
        }
        
    }

    public static File createFile() throws FileNotFoundException{
        File file = new File("things.text");
        if (file.exists()) {
            System.out.println("Already exists");
            System.exit(1);
        }
        try (PrintWriter output = new PrintWriter(file);) {
            output.println("90");
            output.println("John");
            output.println("80");
            output.println("Lizzy");
            output.close();
        }
        return file;
    }

}
