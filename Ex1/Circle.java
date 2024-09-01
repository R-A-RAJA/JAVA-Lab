import java.util.Scanner;

class Circle{
    public static void main(String arg[]){
        int r;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        r=input.nextInt();
        double pere=2*3.14*r;
        double area=3.14*r*r;
        System.out.println("Area of Circle: "+area);
        System.out.println("Perimeter of Circle: "+pere);
    }
}