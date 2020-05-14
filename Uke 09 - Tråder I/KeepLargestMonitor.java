import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock; // Lås som man kan komme seg inn i flere ganger

class KeepLargestMonitor {
  private final Lock laas = new ReentrantLock();
  private int largest;

  public int getLargest() {
    return largest;
  }

  public void submitNumber(int number) {
    laas.lock();
    try {
      largest = Math.max(largest, number); // returnerer det tallet som er størst
    } catch (Exception e) {

    } finally {
      laas.unlock();
    }
  }
}
