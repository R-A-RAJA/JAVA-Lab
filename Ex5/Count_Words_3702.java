import java.util.Arrays;
import java.util.Scanner;

class Word {
    void WordCount(String a) {
        String[] split_word=a.split(" ");
        System.out.println("Number of words present in the given string: "+(split_word.length));
    }
}

public class Count_Words_3702 {
    public static void main(String []args){
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Word obj=new Word();
        Scanner in=new Scanner(System.in);
        System.out.print("\nEnter the string: ");
        String a=in.nextLine();
        obj.WordCount(a);
    }
}
