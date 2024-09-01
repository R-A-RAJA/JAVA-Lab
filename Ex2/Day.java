import java.util.Scanner;
public class Day {
    public static void main(String args[]){
	    System.out.println("Name: Athithraja");
        System.out.println("Regno: 2022503702");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (dd-mm-yyyy): ");
        String inputDate = scanner.nextLine();
        String[] dateParts = inputDate.split("-");
        int d = Integer.parseInt(dateParts[0]);
        int m = Integer.parseInt(dateParts[1]);
        int y = Integer.parseInt(dateParts[2]);
        if (d<=31 && m<=12){
            int y1=y-(14-m)/12;
            int x=y1+y1/4-y1/100+y1/400;
            int m1=m+12*((14-m)/12)-2;
            int d1=(d+x+(31*m1)/12)%7;
            String a[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
            System.out.println("The day of given date is "+a[d1]);
        }
        else{
            System.out.println("Enter the valid date!");
        }
    }
}