
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String nameOldest = "";
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            String[] parts = line.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            if (age > oldest) {
                oldest = age;
                nameOldest = name;
            }
        }
        System.out.println("Name of the oldest: " + nameOldest);
    }
}
