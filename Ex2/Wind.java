import java.util.Scanner;
import java.lang.Math;

public class Wind {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Name: Athithraja");
        System.out.println("Regno: 2022503702");
        System.out.print("Enter temperature in degrees Fahrenheit: ");
        int t=in.nextInt();
        System.out.print("Enter wind speed in miles per hour: ");
        int v=in.nextInt();
        if (t<=50 && (v>=3 && v<=120)){
            double w=35.74+0.6215*t+((0.4275*t)-35.75)*Math.pow(v, 0.16);
            System.out.printf("The wind chill index is %,.2f°F\n",w);
        }
        else{
            if (t>50){
                System.out.println("Temprature value should smaller than 50.");
            }
            else if (v<3 && v>120){
                System.out.println("Wind speed should between range 3 to 120 mph.");
            }
            else{
                System.out.println("Temprature value should larger than 50.\nWind speed should between range 3 to 120 mph.");
            }
        }
    }
}
