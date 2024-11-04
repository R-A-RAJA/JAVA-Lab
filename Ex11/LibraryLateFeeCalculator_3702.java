import java.util.Scanner;

public class LibraryLateFeeCalculator_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of overdue days: ");
        int overdueDays = scanner.nextInt();
        System.out.print("Enter membership type (1 for Regular, 2 for Premium): ");
        int membershipType = scanner.nextInt();

        int lateFee = overdueDays * 5;
        if (membershipType == 2) {
            lateFee = (int)(lateFee * 0.5);
        }

        System.out.println("Total late fee: " + lateFee);
    }
}
