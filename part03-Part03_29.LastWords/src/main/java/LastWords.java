
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            String[] piece = line.split(" ");
            String last = piece[piece.length - 1];
            System.out.println(last);
        }
    }
}
