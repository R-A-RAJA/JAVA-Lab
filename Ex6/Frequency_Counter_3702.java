import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Counter {
    void count(String line, String word) {
        String[] splited_list = line.split(" ");
        //System.out.println("Splited list: "+ Arrays.toString(splited_list));
        int c = 0;
        for (String s : splited_list) {
            if (s.equals(word)) {
                c = c + 1;
            }
        }
        System.out.println("Occurence of word - \"" + word + "\" : " + c);
    }
}

public class Frequency_Counter_3702 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Counter obj = new Counter();
        System.out.println("Name: ATHITHRAJA.R\nRegno: 2022503702");
        System.out.print("\nEnter the line: ");
        String line = in.nextLine();
        System.out.print("Find the occurence of: ");
        String word = in.next();
        obj.count(line, word);
    }
}