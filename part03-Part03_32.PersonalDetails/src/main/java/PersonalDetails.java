
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int longestNameLength = 0;
        int count = 0;
        int sum = 0;
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            String[] parts = line.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            int nameLength = name.length();
            if (nameLength > longestNameLength) {
                longestNameLength = nameLength;
                longestName = name;
            }
            sum += age;
            count += 1;
        }
        System.out.println("");
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth: " + (1.0 * sum / count));
    }
}
