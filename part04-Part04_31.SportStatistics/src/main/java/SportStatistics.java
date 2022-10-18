
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        int games = 0;
        int win = 0;
        int lose = 0;
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);
                if (teamName.equals(homeTeam)) {
                    games++;
                    if(homeScore > awayScore) {
                        win++;
                    } else {
                        lose++;
                    }
                } else if (teamName.equals(awayTeam)) {
                    games++;
                    if(homeScore < awayScore) {
                        win++;
                    } else {
                        lose++;
                    }
                }
            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + lose);
        } catch (Exception e) {

        }
    }

}
