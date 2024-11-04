class LibraryMember_3702 {
    String name;
    String memberId;

    public LibraryMember_3702(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void displayInfo() {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
    }
}

class StudentMember_3702 extends LibraryMember_3702 {
    public StudentMember_3702(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Student, Borrow Limit: 3");
    }
}

class StaffMember_3702 extends LibraryMember_3702 {
    public StaffMember_3702(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Staff, Borrow Limit: 5");
    }

    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        LibraryMember_3702 student = new StudentMember_3702("Rajesh", "S001");
        LibraryMember_3702 staff = new StaffMember_3702("Raj", "ST001");

        student.displayInfo();
        System.out.println();
        staff.displayInfo();
    }
}
