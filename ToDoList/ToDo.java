package ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        boolean condition = true;
        ArrayList<String> TodoList = new ArrayList<>();
        TodoList.add("No tasks in the list.");
        Scanner input = new Scanner(System.in);
        System.out.println("Your To Do list is ready!");
        ToDoTasks.showActions();
        while (condition == true) {
            System.out.println("Type the number of your action: ");
            int num = input.nextInt();
            switch (num) {
                case 1:
                    ToDoTasks.showActions();
                    break;
                case 2:
                    ToDoTasks.printList(TodoList);
                    break;
                case 3:
                    ToDoTasks.createTask(TodoList);
                    break;
                case 4:
                    ToDoTasks.changeTask(TodoList);
                    break;
                case 5:
                    ToDoTasks.deleteTask(TodoList);
                    break;
                case 6:
                    ToDoTasks.restartList(TodoList);
                    break;
                case 7:
                    condition=false;
                    break;
            }
        }
        input.close();
    }

}
