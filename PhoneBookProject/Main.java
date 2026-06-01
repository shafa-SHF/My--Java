package PhoneBookProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== PHONE BOOK MENU =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = input.nextLine();

                    System.out.print("Phone: ");
                    String phone = input.nextLine();

                    PhoneBook.addContact(name, phone);
                    break;

                case 2:
                    PhoneBook.viewContacts();
                    break;

                case 3:
                    System.out.print("Search keyword: ");
                    String keyword = input.nextLine();

                    PhoneBook.searchContact(keyword);
                    break;

                case 4:
                    System.out.print("Enter name or phone to delete: ");
                    String deleteKeyword = input.nextLine();

                    PhoneBook.deleteContact(deleteKeyword);
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        input.close();
    }
}
