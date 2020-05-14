import java.util.concurrent.CountDownLatch;
import java.util.Random;

class Contender implements Runnable {
  private final KeepLargestMonitor monitor;
  private final CountDownLatch alleTraaderFerdigBarriere;
  private final int id;
  private static int idGenerator;


  public Contender(KeepLargestMonitor monitor, CountDownLatch alleTraaderFerdigBarriere) {
    this.id = idGenerator++;
    this.monitor = monitor;
    this.alleTraaderFerdigBarriere = alleTraaderFerdigBarriere;
  }

  @Override
  public void run() {
    Random random = new Random();
    int number = random.nextInt(200);
    System.out.println("Tråd #" + id + " fikk tall: " + number);
    monitor.submitNumber(number);

    alleTraaderFerdigBarriere.countDown();

    try {
      alleTraaderFerdigBarriere.await();
    } catch (InterruptedException e) {

    }

    if (number == monitor.getLargest()) {
      System.out.println("Tråd #" + id + " vant!");
    } else {
      System.out.println("Tråd #" + id + " tapte!");
    }
  }
}
