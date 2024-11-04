import java.io.*;
import java.util.ArrayList;

class Student_3702 implements Serializable {
    private String name;
    private double GPA;

    public Student_3702(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", GPA: " + GPA;
    }
}

public class StudentManagement_3702 {
    private static final String FILE_NAME = "students_3702.dat";

    public static void main(String[] args) {
        System.out.print("Name: Athithraja. R\nReg.no: 2022503702\n");

        ArrayList<Student_3702> students = new ArrayList<>();

        students.add(new Student_3702("Athithraja", 9.5));
        students.add(new Student_3702("Raja", 9.8));
        saveStudents(students);

        updateStudentGPA("Athithraja", 9.9);
        displayStudents();
    }

    public static void saveStudents(ArrayList<Student_3702> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
            System.out.println("Students saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving students: " + e);
        }
    }

    public static void updateStudentGPA(String name, double newGPA) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            @SuppressWarnings("unchecked")
            ArrayList<Student_3702> students = (ArrayList<Student_3702>) ois.readObject();
            for (Student_3702 student : students) {
                if (student.getName().equals(name)) {
                    student.setGPA(newGPA);
                    System.out.println("GPA updated for " + name);
                    saveStudents(students);
                    return;
                }
            }
            System.out.println("Student not found.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error updating GPA: " + e);
        }
    }

    public static void displayStudents() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            @SuppressWarnings("unchecked")
            ArrayList<Student_3702> students = (ArrayList<Student_3702>) ois.readObject();
            System.out.println("Student List:");
            for (Student_3702 student : students) {
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error displaying students: " + e);
        }
    }
}
