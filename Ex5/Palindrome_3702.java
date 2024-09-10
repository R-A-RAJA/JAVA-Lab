import java.util.Objects;
import java.util.Scanner;

class Check{
    String Reverse(String a){
        String reverse_string="";
        for(int i=0; i<a.length();i++){
            reverse_string=a.charAt(i)+reverse_string;
        }
        return reverse_string;
    }
    void check_palindrome(String a){
        if (a.equals(Reverse(a))){
            System.out.println("Given string - "+a+" is Palindrome.");
        }
        else{
            System.out.println("Given string - "+a+" is Not Palindrome.");
        }
    }
}

public class Palindrome_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Check obj = new Check();
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the string: ");
        String a = in.nextLine();
        obj.check_palindrome(a);
    }
}
