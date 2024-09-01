import java.util.Scanner;
public class And {
    public static void main(String arg[]){
        System.out.println("Name: Athithraja");
        System.out.println("Regno: 2022503702");
        Scanner in=new Scanner(System.in);
        double bias=-0.5;
        double w0=1.0;
        double w1=1.0;
        System.out.print("Enter value of x1: ");
        int x1=in.nextInt();
        System.out.print("Enter value of x2: ");
        int x2=in.nextInt();
        if (x1==0 || x1==1 ||x2==0||x2==1){
            //Y=Bias +W0⋅X1+W1⋅X2Y 
            double y=bias+w0*x1+w1*x2;
            if (y>0.5){
                System.out.println("Output: 1");
            }
            else{
                System.out.println("Output: 0");
            }
        }
        else{
            System.out.println("Enter the value 0 or 1.");
        }
    }
}
