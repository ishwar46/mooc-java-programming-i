public class Fitbyte {
  private int age;
  private int restHeart;

  public Fitbyte(int personAge, int restingHeartRate) {
    this.age = personAge;
    this.restHeart = restingHeartRate;
  }

  public double targetHeartRate(double percentageOfMaximum) {
    double maxHeartRate = 206.3 - (0.711 * age);
    double result = (maxHeartRate - this.restHeart) * (percentageOfMaximum) + this.restHeart;
    return result;
  }
}
