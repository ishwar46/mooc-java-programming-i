import java.util.ArrayList;

public class Hold {
  private int maxWeight;
  private ArrayList<Suitcase> suitcases;
  public Hold(int maxWeight) {
    this.maxWeight = maxWeight;
    this.suitcases = new ArrayList<Suitcase>();
  }

  public int holdWeight() {
    int totalWeight = 0;
    for (Suitcase suitcase: this.suitcases) {
      totalWeight += suitcase.totalWeight();
    }
    return totalWeight;
  }

  public void addSuitcase(Suitcase suitcase) {
    if (this.holdWeight() + suitcase.totalWeight() <= this.maxWeight) {
      this.suitcases.add(suitcase);
    }
  }

  public void printItems() {
    for (Suitcase suitcase: this.suitcases) {
      suitcase.printItems();
    }
  }

  public String toString() {
    return this.suitcases.size() + " suitcases (" + this.holdWeight() + " kg)";
  }
}
