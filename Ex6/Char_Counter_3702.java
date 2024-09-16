import java.util.Arrays;
import java.util.Scanner;

class Methods {
    void CharCount(String a) {
        int[] freq = new int[a.length()];
        int i, j;
        char[] string = a.toCharArray();
        for (i = 0; i < a.length(); i++) {
            freq[i] = 1;
            for (j = i + 1; j < a.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        for (i = 0; i < freq.length; i++) {
            if (string[i] != ' ' && string[i] != '0') {
                System.out.print(string[i] + ":" + freq[i]);
                if (i < freq.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println(" ");
    }
}

public class Char_Counter_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Methods obj = new Methods();
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the string: ");
        String a = in.nextLine();
        obj.CharCount(a);
    }
}