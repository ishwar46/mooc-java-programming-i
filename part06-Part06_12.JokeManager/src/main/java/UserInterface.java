import java.util.Scanner;

public class UserInterface {
  private Scanner scanner;
  private JokeManager jokeMan;
  public UserInterface(JokeManager jokeMan, Scanner scanner) {
    this.jokeMan = jokeMan;
    this.scanner = scanner;
  }

  public void start() {
    boolean isTrue = true;
    while (isTrue) {
      System.out.println("Commands:");
      System.out.println("1 - add a joke");
      System.out.println("2 - draw a joke");
      System.out.println("3 - list jokes");
      System.out.println("X - stop");
      String command = scanner.nextLine();

      switch (command) {
        case "1":
          System.out.println("Write the joke to be added:");
          String addJoke = scanner.nextLine();
          jokeMan.addJoke(addJoke);
          break;

        case "2":
          System.out.println("Drawing a joke.");
          System.out.println(jokeMan.drawJoke());
          break;
      
        case "3":
          System.out.println("Printing the jokes.");
          jokeMan.printJokes();
          break;

        case "X":
          isTrue = false;
          break;

        default:
          System.out.println("Wrong command");
      }
    }
  }
}
