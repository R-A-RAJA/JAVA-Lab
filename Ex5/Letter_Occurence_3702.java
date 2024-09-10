import java.util.Arrays;
import java.util.Scanner;

class Methods {
    void LetterCount(String a) {
        int[] count = new int[128];

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            count[ch]++;
        }
        for (int i = 0; i < 128; i++) {
            if (count[i] > 0) {
                System.out.println("No. of letter - "+(char) i + " : " + count[i]);
            }
        }
    }
}

public class Letter_Occurence_3702 {
    public static void main(String []args){
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Methods obj=new Methods();
        Scanner in=new Scanner(System.in);
        System.out.print("\nEnter the string: ");
        String a=in.nextLine();
        obj.LetterCount(a);
    }
}
