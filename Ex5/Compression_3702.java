import java.util.Scanner;

class Reduce {
    public String change(String a, String comp, char current, int count) {
        comp += current + String.valueOf(count);
        return comp;
    }
    void compress(String a) {
        String comp = "";
        char current = a.charAt(0);
        int count = 1;

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == current) {
                count++;
            } else {
                comp = change(a, comp, current, count);
                current = a.charAt(i);
                count = 1;
            }
        }
        comp = change(a, comp, current, count);
        if (comp.length() >= a.length()) {
            System.out.println("Not compressed: "+a);
        } else {
            System.out.println("Compressed String: "+comp);
        }
    }
}

public class Compression_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Reduce obj = new Reduce();
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the string: ");
        String a = in.nextLine();
        obj.compress(a);
    }
}
