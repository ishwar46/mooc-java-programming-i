import java.util.ArrayList;

public class Suitcase {
  private ArrayList<Item> items;
  private int maxWeight;
  public Suitcase(int weight) {
    this.items = new ArrayList<Item>();
    this.maxWeight = weight;
  }

  public int totalWeight() {
    int weight = 0;
    for (Item item: items) {
      weight += item.getWeight();
    }
    return weight;
  }

  public void addItem(Item item) {
    if (totalWeight() + item.getWeight() <= this.maxWeight) {
      items.add(item);
    }
  }

  public void printItems() {
    for (Item item: items) {
      System.out.println(item);
    }
  }

  public Item heaviestItem() {
    if (this.items.isEmpty()) {
      return null;
    }

    Item heaviest = this.items.get(0);

    for (Item item: items) {
      if (item.getWeight() > heaviest.getWeight()) {
        heaviest = item;
      }
    }
    return heaviest;
  }

  public String toString() {
    if (this.items.size() == 0) {
      return "no items (0 kg)";
    } else if (this.items.size() == 1) {
      return "1 item (" + this.totalWeight() + " kg)";
    }
    return this.items.size() + " items (" + this.totalWeight() + " kg)";
  }
}
