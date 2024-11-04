class Book_3702 {
    String title;
    String author;
    boolean isAvailable;

    public Book_3702(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, this book is currently unavailable.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        Book_3702 book = new Book_3702("Java Programming", "John Doe");
        book.displayInfo();
        book.borrowBook();
        book.displayInfo();
    }
}

