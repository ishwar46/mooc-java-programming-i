import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookInfo = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            bookInfo.add(new Book(title, pages, year));
        }

        System.out.println("");
        System.out.print("What information will be printed? ");
        String infos = scanner.nextLine();
        for (Book info: bookInfo) {
            if (infos.equals("everything")) {
                System.out.println(info.getTitle() + ", " + info.getPages() + " pages, " + info.getYear());
            } else if (infos.equals("name")) {
                System.out.println(info.getTitle());
            }
        }
    }
}
