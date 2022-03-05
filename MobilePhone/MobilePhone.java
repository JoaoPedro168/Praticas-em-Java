package MobilePhone;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    protected ArrayList<Contacts> ListOfContacts = new ArrayList<>();

    public static void main(String[] args) {
        Contacts contact = new Contacts();
        boolean condition = true;
        Scanner input = new Scanner(System.in);
        contact.printOptions();
        System.out.println("");
        while (condition == true) {
            System.out.println("Type the number of your action: ");
            int num = input.nextInt();
            switch (num) {
                case 1:
                    contact.printOptions();
                    System.out.println("");
                    break;
                case 2:
                    contact.printList();
                    System.out.println("");
                    break;
                case 3:
                    contact.newContact();
                    System.out.println("");
                    break;
                case 4:
                    contact.removeContact();
                    System.out.println("");
                    break;
                case 5:
                    contact.updateContact();
                    System.out.println("");
                    break;
                case 6:
                    contact.queryContact();
                    System.out.println("");
                    break;
                case 7:
                    condition=false;
                    break;

            }
        }
        input.close();
    }
}
