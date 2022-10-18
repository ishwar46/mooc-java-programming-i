
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.print("First number? ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.print("Second number? ");
        int secondNum = Integer.valueOf(scanner.nextLine());
        for (int i = firstNum; i <= secondNum; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
