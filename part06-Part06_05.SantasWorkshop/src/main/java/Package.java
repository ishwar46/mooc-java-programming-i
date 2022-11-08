import java.util.ArrayList;

public class Package {
  private ArrayList<Gift> packages;
  public Package() {
    this.packages = new ArrayList<Gift>();
  }

  public void addGift(Gift gift) {
    this.packages.add(gift);
  }

  public int totalWeight() {
    int sumWeight = 0;
    for (Gift weight: packages) {
      sumWeight += weight.getWeight();
    }
    return sumWeight;
  }
}
