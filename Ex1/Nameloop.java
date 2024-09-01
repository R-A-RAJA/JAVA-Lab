import java.util.Scanner;

class Nameloop{
    public static void main(String arg[]){
        String name;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name=input.nextLine();
        System.out.println("Name in Straight Line: ");
        for (int i=0;i<name.length();i++){
            System.out.print(name.charAt(i));
        }
        System.out.println();
        System.out.println("Name letters one by one: ");
        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}