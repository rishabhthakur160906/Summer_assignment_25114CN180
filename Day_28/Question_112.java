// Code to create contact management system.
import java.util.Scanner;

public class Question_112 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[100];
        String[] phones = new String[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n==== Contact Management System ====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Contact Name: ");
                    names[count] = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    phones[count] = sc.nextLine();

                    count++;

                    System.out.println("Contact Added Successfully!");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Contacts Available!");
                    } else {

                        System.out.println("\nAvailable Contacts:");

                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". Name : " + names[i]);
                            System.out.println("   Phone: " + phones[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting Contact Management System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 3);

        sc.close();
    }
}