import java.util.ArrayList;
import java.util.Scanner;

class LibraryManagementSystem_3702 {
    private ArrayList<String> books;

    public LibraryManagementSystem_3702() {
        books = new ArrayList<>();
        books.add("Java Programming");
        books.add("Data Structures");
        books.add("Design Patterns");
    }

    public void displayBooks() {
        System.out.println("Available Books:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }

    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        LibraryManagementSystem_3702 library = new LibraryManagementSystem_3702();
        library.displayBooks();
    }
}
