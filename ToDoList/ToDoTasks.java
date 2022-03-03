package ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoTasks {

    public static void showActions() {
        System.out.println("Option 1: Show possible actions");
        System.out.println("Option 2: Show the list");
        System.out.println("Option 3: Create a task");
        System.out.println("Option 4: Change a task");
        System.out.println("Option 5: Delete a task");
        System.out.println("Option 6: Restart the entire list");
        System.out.println("Option 7: Exit the program");
    }

    public static void printList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Task " + (i + 1) + ": " + list.get(i));
        }
    }

    public static void createTask(ArrayList<String> list){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the task to add in the list: ");
        String value = scan.nextLine();
        list.remove("No tasks in the list.");
        list.add(value);

    }

    public static void changeTask(ArrayList<String> list){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the task to change in the list: ");
        String value = scan.nextLine();
        System.out.println("Enter the new task: ");
        String value2 = scan.nextLine();
        list.set(list.indexOf(value),value2);
    }

    public static void deleteTask(ArrayList<String> list) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the task to delete in the list: ");
        String value = scan.nextLine();
        list.remove(value);
        if (list.isEmpty()){
            list.add("No tasks in the list");
        }
    }

    public static void restartList(ArrayList<String> list) {
        list.removeAll(list);
        list.add("No tasks in the list.");
        System.out.println("The list is empty now.");
    }

}
