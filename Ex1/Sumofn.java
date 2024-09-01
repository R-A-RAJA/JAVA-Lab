import java.util.Scanner;

class Sumofn{
    public static void main(String arg[]){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the N value: ");
        int a=input.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++){
            sum=sum+i;
        }
        System.out.println("Sum of N: "+sum);
    }
}