
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    /*
        Tom
        Emma
        Alex
        Mary

        Search for? Mary
        Mary was found!
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println(" ");
        System.out.print("Search for? ");
        String name = scanner.nextLine();
        if (list.contains(name)) {
            System.out.println(name + "was found!");
        } else {
            System.out.println(name + "was not found!");
        }
    }
}
