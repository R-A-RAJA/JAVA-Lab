import java.util.Scanner;
class Check {
    void checkPangram(String a) {
        boolean[] alphabet = new boolean[26];
        a = a.toLowerCase();
        for (char c : a.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }
        boolean isPangram = true;
        String missingLetters = "";
        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                isPangram = false;
                missingLetters += (char) (i + 'a') + ", ";
            }
        }
        if (isPangram) {
            System.out.println("Yes, the string is a pangram.");
        } else {
            System.out.println("No, the string is not a pangram. Missing letter(s) is(are) " + missingLetters);
        }
    }
}
public class Pangram_3702 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Check obj = new Check();
        System.out.println("Name: ATHITHRAJA.R\nRegno: 2022503702");
        System.out.print("\nEnter the line: ");
        String line = in.nextLine();
        obj.checkPangram(line);
    }
}