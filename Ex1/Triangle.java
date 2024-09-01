import java.util.Scanner;

class Triangle{
    public static void main(String arg[]){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter 1st side of tiangle: ");
        int a=input.nextInt();
        System.out.print("Enter 2st side of tiangle: ");
        int b=input.nextInt();
        System.out.print("Enter 3st side of tiangle: ");
        int c=input.nextInt();
        System.out.print("Enter base of tiangle: ");
        int ba=input.nextInt();
        System.out.print("Enter height of tiangle: ");
        int h=input.nextInt();
        int pere=a+b+c;
        double area=0.5*ba*h;
        System.out.println("Area of Triangle: "+area);
        System.out.println("Perimeter of Triangle: "+pere);
    }
}