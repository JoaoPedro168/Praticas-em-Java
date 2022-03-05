package MobilePhone;

import java.util.Scanner;

public class Contacts extends MobilePhone {

    private String name;
    private int phoneNumber;

    public Contacts(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contacts() {
    }

    public void printOptions() {
        System.out.println("Option 1: Print options");
        System.out.println("Option 2: Print list of contacts");
        System.out.println("Option 3: Add new contact");
        System.out.println("Option 4: Remove a contact");
        System.out.println("Option 5: Update a contact");
        System.out.println("Option 6: Find a contact");
        System.out.println("Option 7: Quit the application");
    }

    public void printList() {
        for (int i = 0; i < super.ListOfContacts.size(); i++) {
            System.out.println("Name: " + super.ListOfContacts.get(i).name + "   "
                    + " Phone-number: " + super.ListOfContacts.get(i).phoneNumber);
        }
    }

    public void newContact() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the contact: ");
        String name = input.nextLine();
        System.out.print("Enter the number of the contact: ");
        int number = input.nextInt();
        Contacts newContact = new Contacts(name, number);
        super.ListOfContacts.add(newContact);
    }

    public void updateContact() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the contact: ");
        String name = input.nextLine();
        System.out.print("Enter the new number of the contact: ");
        int number = input.nextInt();
        Contacts updateContact = new Contacts(name, number);
        for (int i = 0; i < super.ListOfContacts.size(); i++) {
            if (super.ListOfContacts.get(i).name.equalsIgnoreCase(updateContact.name)) {
                super.ListOfContacts.set(i, updateContact);
            } else {
                System.out.println("The name ins't in the phone-number list!");
            }
        }

    }

    public void removeContact() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the contact to remove: ");
        String inputName = input.nextLine();
        for (int i = 0; i < super.ListOfContacts.size(); i++) {
            if (super.ListOfContacts.get(i).name.equalsIgnoreCase(inputName)) {
                super.ListOfContacts.remove(i);
            } else {
                System.out.println("The name isn't in the phone-numbers list!");
            }
        }
    }

    public void queryContact() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the contact you want to find: ");
        String inputName = input.nextLine();
        for (int i = 0; i < super.ListOfContacts.size(); i++) {
            if (super.ListOfContacts.get(i).name.equalsIgnoreCase(inputName)) {
                System.out.println("Name: " + super.ListOfContacts.get(i).name + "   "
                        + " Phone-number: " + super.ListOfContacts.get(i).phoneNumber);
            } else {
                System.out.println("The name isn't in the phone-numbers list!");
            }
        }
    }

}
