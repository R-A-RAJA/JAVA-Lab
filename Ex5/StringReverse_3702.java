import java.util.Scanner;

class Operation{
    void Reverse(String a){
        String reverse_string="";
        for(int i=0; i<a.length();i++){
            reverse_string=a.charAt(i)+reverse_string;
        }
        System.out.println("Reversed String: "+reverse_string);
    }
}

public class StringReverse_3702 {
    public static void main(String []args){
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Operation obj=new Operation();
        Scanner in=new Scanner(System.in);
        System.out.print("\nEnter the string: ");
        String a=in.nextLine();
        obj.Reverse(a);
    }
}
