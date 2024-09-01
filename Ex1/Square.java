import java.util.Scanner;

class Square{
    public static void main(String arg[]){
        int a;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter length of square: ");
        a=input.nextInt();
        int area=a*a;
        int pere=2*a;
        System.out.println("Area of Square: "+area);
        System.out.println("Perimeter of Square: "+pere);
    }
}