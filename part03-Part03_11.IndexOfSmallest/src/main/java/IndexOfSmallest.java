
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    /* 
    Example
        72
        2
        8
        8
        11
        9999

        Smallest number: 2
        Found at index: 1
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }
            list.add(number);
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = list.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (smallest > list.get(i)) {
                smallest = list.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < list.size(); i++) { 
            if (list.get(i).equals(smallest)) {
                smallestIndex = i;
                System.out.println("Found at index: " + smallestIndex);
            }
        }
    }
}
