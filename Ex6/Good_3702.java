import java.util.Scanner;

class Good_Bad {
    void badToGood(String line) {
        String newstr = line.replaceAll("(not)[^&]*(bad)", "good");
        System.out.println("Output: " + newstr);
    }
}

public class Good_3702 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Good_Bad obj = new Good_Bad();
        System.out.println("Name: ATHITHRAJA.R\nRegno: 2022503702");
        System.out.print("\nEnter the line: ");
        String line = in.nextLine();
        obj.badToGood(line);
    }
}