import java.util.ArrayList;
import java.util.Scanner;

public class DigitalLibrary {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> books = new ArrayList<>();

    public static void main(String[] args) {

        books.add("Java Programming");
        books.add("Spring Boot Basics");
        books.add("Database Management Systems");

        while (true) {
            System.out.println("\n=== Digital Library Menu ===");
            System.out.println("1. View Books");
            System.out.println("2. Add Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    issueBook();
                    break;
                case 4:
                    System.out.println("Thank you for using Digital Library");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void viewBooks() {
        System.out.println("\nAvailable Books:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }

    static void addBook() {
        System.out.print("Enter book name: ");
        String book = scanner.nextLine();
        books.add(book);
        System.out.println("Book added successfully");
    }

    static void issueBook() {
        System.out.print("Enter book name to issue: ");
        String book = scanner.nextLine();
        if (books.remove(book)) {
            System.out.println("Book issued successfully");
        } else {
            System.out.println("Book not available");
        }
    }
}
