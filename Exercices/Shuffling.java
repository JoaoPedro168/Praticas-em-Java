package Exercices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Shuffling {
    public static void shuffling(ArrayList<Number> list) {
        ArrayList<Number> list2 =new ArrayList<>();
        Random rand = new Random();
        int n =0;
        while (n<list.size()+list2.size()){
            list2.add(list.remove(rand.nextInt(list.size())));
            n++;
        }
        System.out.println("Shuffled list:");
        System.out.println(list2);
    }

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        Collections.addAll(list, 23, 4.8, 34, 90, 9.5);
        shuffling(list);
    }
}
