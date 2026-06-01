package PhoneBookProject;

import java.io.*;
import java.util.*;

public class PhoneBook {

    private static final String FILE_NAME = "phone.txt";

    // Add Contact
    public static void addContact(String name, String phone) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true));

            bw.write(name + " - " + phone);
            bw.newLine();

            bw.close();

            System.out.println("Contact added successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // View Contacts
    public static void viewContacts() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String line;

            System.out.println("\n===== CONTACT LIST =====");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("No contacts found.");
        }
    }

    // Search Contact
    public static void searchContact(String keyword) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {

                if (line.toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println(line);
                    found = true;
                }
            }

            br.close();

            if (!found) {
                System.out.println("Contact not found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    // Delete Contact
    public static void deleteContact(String keyword) {

        ArrayList<String> contacts = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String line;

            while ((line = br.readLine()) != null) {

                if (!line.toLowerCase().contains(keyword.toLowerCase())) {
                    contacts.add(line);
                }
            }

            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME));

            for (String contact : contacts) {
                bw.write(contact);
                bw.newLine();
            }

            bw.close();

            System.out.println("Contact deleted successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
