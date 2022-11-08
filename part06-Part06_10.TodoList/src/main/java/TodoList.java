import java.util.ArrayList;

public class TodoList {
  private ArrayList<String> todoList;
  public TodoList() {
    this.todoList = new ArrayList<>();
  }

  public void add(String task) {
    this.todoList.add(task);
  }

  public void print() {
    int index = 1;
    for (String todo: todoList) {
      System.out.println(index + ": " + todo);
      index++;
    }
  }

  public void remove(int number) {
    this.todoList.remove(number - 1);
  }
}
