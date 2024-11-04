interface LibraryServices_3702 {
    void borrowBook();
    void returnBook();
}

abstract class LibraryMember_3702 implements LibraryServices_3702 {
    String name;

    public LibraryMember_3702(String name) {
        this.name = name;
    }

    public abstract void displayInfo();
}

class StudentMember_3702 extends LibraryMember_3702 {
    public StudentMember_3702(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Member Type: Student, Name: " + name);
    }

    @Override
    public void borrowBook() {
        System.out.println(name + " borrowed a book.");
    }

    @Override
    public void returnBook() {
        System.out.println(name + " returned a book.");
    }

    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        StudentMember_3702 student = new StudentMember_3702("Alice");
        student.displayInfo();
        student.borrowBook();
        student.returnBook();
    }
}
