import java.util.Scanner;

class Myself{
    public static void main(String arg[]){
        String name;
        long reg;
        String address;
        Boolean graduate;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name=input.nextLine();
        System.out.print("Enter your Regno: ");
        reg=input.nextLong();
        input.nextLine();
        System.out.print("Enter your Address: ");
        address=input.nextLine();
        System.out.print("Is Graduated? : ");
        graduate=input.nextBoolean();
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+reg);
        System.out.println("Address: "+address);
        System.out.println("Graduate: "+graduate);
    }
}