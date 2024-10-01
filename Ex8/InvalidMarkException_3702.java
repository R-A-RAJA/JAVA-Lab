class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}
class Student {
    private int marks;
    public void setMarks(int marks) throws InvalidMarkException {
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        if (marks < 0 || marks > 100) {
            throw new InvalidMarkException("Invalid marks! Marks must be between 0 and 100.");
        }
        this.marks = marks;
        System.out.println("Marks set successfully: " + marks);
    }
}
// Main
public class InvalidMarkException_3702 {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.setMarks(99);
            student.setMarks(105);
        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}