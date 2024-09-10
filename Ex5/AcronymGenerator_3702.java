import java.util.Scanner;
class AcronymGenerator {
 String[][] acronyms = {
 {"JVM", "Java Virtual Machine"},
 {"JDK", "Java Development Kit"},
 {"JRE", "Java Runtime Environment"},
 {"API", "Application Programming Interface"},
 {"OOP", "Object Oriented Programming"},
 {"JPA", "Java Persistence API"},
 {"JSP", "JavaServer Pages"},
 {"Servlet", "Server Applet"}
 };
 String getFullForm(String acronym) {
 for (int i = 0; i < acronyms.length; i++) {
 if (acronyms[i][0].equalsIgnoreCase(acronym)) {
 return acronyms[i][1];
 }
 }
 return "Acronym not found!";
 }
}
13
public class AcronymGenerator_3702 {
 public static void main(String[] args) {
 System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
 AcronymGenerator generator = new AcronymGenerator();
 Scanner in = new Scanner(System.in);
 System.out.print("\nEnter a Java-related acronym: ");
 String acronym = in.nextLine();
 String fullForm = generator.getFullForm(acronym);
 System.out.println("Full Form: " + fullForm);
 }
}
