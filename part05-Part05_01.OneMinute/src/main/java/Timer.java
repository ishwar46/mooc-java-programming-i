public class Timer {
  private ClockHand hundSec;
  private ClockHand secs;

  public Timer() {
    this.hundSec = new ClockHand(100);
    this.secs = new ClockHand(60);
  }

  public void advance() {
    this.hundSec.advance();
    if (this.hundSec.value() == 0) {
      this.secs.advance();
    }
  }

  public String toString() {
    return this.secs + ":" + this.hundSec;
  }
}
