import java.util.ArrayList;
import java.util.Scanner;

// Class to represent a Contact
class Contact {
    String name;
    String phoneNumber;
    String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber + ", Email: " + email;
    }
}

// Main Contact Management System
public class ContactManagementSystem {
    private static ArrayList<Contact> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nContact Management System:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Method to add a contact
    private static void addContact() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        String phoneNumber = "";
        do {
            System.out.print("Enter Phone Number (10 digits): ");
            phoneNumber = scanner.nextLine();
            if (!isValidPhoneNumber(phoneNumber)) {
                System.out.println("Invalid phone number! Please enter a 10-digit number.");
            }
        } while (!isValidPhoneNumber(phoneNumber));

        String email = "";
        do {
            System.out.print("Enter Email (must end with @gmail.com): ");
            email = scanner.nextLine();
            if (!isValidEmail(email)) {
                System.out.println("Invalid email! Please ensure it ends with '@gmail.com'.");
            }
        } while (!isValidEmail(email));

        contacts.add(new Contact(name, phoneNumber, email));
        System.out.println("Contact added successfully!");
    }

    // Method to view all contacts
    private static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("\nContacts:");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }
    }

    // Method to update a contact
    private static void updateContact() {
        viewContacts();
        if (!contacts.isEmpty()) {
            System.out.print("\nEnter the contact number to update: ");
            int index = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            if (index >= 1 && index <= contacts.size()) {
                Contact contact = contacts.get(index - 1);
                
                System.out.print("Enter new Name (current: " + contact.name + ", press enter to skip): ");
                String name = scanner.nextLine();
                if (!name.isEmpty()) {
                    contact.name = name;
                }

                System.out.print("Enter new Phone Number (current: " + contact.phoneNumber + ", press enter to skip): ");
                String phoneNumber = scanner.nextLine();
                if (!phoneNumber.isEmpty() && isValidPhoneNumber(phoneNumber)) {
                    contact.phoneNumber = phoneNumber;
                } else if (!phoneNumber.isEmpty()) {
                    System.out.println("Invalid phone number, keeping the old number.");
                }

                System.out.print("Enter new Email (current: " + contact.email + ", press enter to skip): ");
                String email = scanner.nextLine();
                if (!email.isEmpty() && isValidEmail(email)) {
                    contact.email = email;
                } else if (!email.isEmpty()) {
                    System.out.println("Invalid email, keeping the old email.");
                }

                System.out.println("Contact updated successfully!");
            } else {
                System.out.println("Invalid contact number!");
            }
        }
    }

    // Method to delete a contact
    private static void deleteContact() {
        viewContacts();
        if (!contacts.isEmpty()) {
            System.out.print("\nEnter the contact number to delete: ");
            int index = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            if (index >= 1 && index <= contacts.size()) {
                contacts.remove(index - 1);
                System.out.println("Contact deleted successfully!");
            } else {
                System.out.println("Invalid contact number!");
            }
        }
    }

    // Method to validate phone number
    private static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}");
    }

    // Method to validate email
    private static boolean isValidEmail(String email) {
        return email.endsWith("@gmail.com");
    }
}

