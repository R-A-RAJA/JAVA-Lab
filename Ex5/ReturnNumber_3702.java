import java.util.Scanner;
class Numbers{
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    void return_numbers(String a) {
        String num="";
        for (int i = 0; i < a.length(); i++) {
            if (isInteger(String.valueOf(a.charAt(i)))) {
                num=num+(a.charAt(i));
            }
        }
        System.out.println("Numeric String: "+num);
    }
}
public class ReturnNumber_3702 {
    public static void main(String []args){
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Numbers obj=new Numbers();
        Scanner in=new Scanner(System.in);
        System.out.print("\nEnter the string: ");
        String a=in.nextLine();
        obj.return_numbers(a);
    }
}
