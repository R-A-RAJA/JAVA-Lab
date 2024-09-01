import java.util.Random;

public class Intrest {

    public static void main(String[] args) {
        System.out.println("Name: Athithraja");
        System.out.println("Regno: 2022503702");
        Random random = new Random();
        long principal = 10000 + random.nextInt(90001);
        double annualRate = 1.0 + (9.0 * random.nextDouble());
        int years = 1 + random.nextInt(30);
        double rate = annualRate / 100.0;
        double futureValue = principal * Math.pow(1 + rate, years);

        System.out.printf("Principal: ₹%,d\n", principal);
        System.out.printf("Annual Rate: %.2f%%\n", annualRate);
        System.out.printf("Years: %d\n", years);
        System.out.printf("Future Value: ₹%.2f\n", futureValue);
    }
}

