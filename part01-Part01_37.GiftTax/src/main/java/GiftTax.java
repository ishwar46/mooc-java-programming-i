
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        double eightTax = 100 + (value - 5_000) * 0.08;
        double tenTax = 1_700 + (value - 25_000) * 0.1;
        double twelveTax = 4_700 + (value - 55_000) * 0.12;
        double fifteenTax = 22_100 + (value - 200_000) * 0.15;
        double seventeenTax = 142_100 + (value - 1_000_000) * 0.17;
        if (value >= 5_000 && value <= 25_000) {
            System.out.println("Tax: " + eightTax);
        } else if (value >= 25_000 && value <= 55_000) {
            System.out.println("Tax: " + tenTax);
        } else if (value >= 55_000 && value <= 200_000) { 
            System.out.println("Tax: " + twelveTax);
        } else if (value >= 200_000 && value <= 1_000_000) {
            System.out.println("Tax: " + fifteenTax);
        } else if (value >= 1_000_000) {
            System.out.println("Tax: " + seventeenTax);
        } else {
            System.out.println("No tax!");
        }
    }
}
