import java.util.concurrent.CountDownLatch;

public class CountDownExample {
  public static void main(String[] args) {

    final int ANTALL_TRAADER = 10;

    CountDownLatch alleTraaderFerdigBarriere = new CountDownLatch(ANTALL_TRAADER);
    KeepLargestMonitor monitor = new KeepLargestMonitor();

    for (int i = 0; i < ANTALL_TRAADER; i++) {
      Contender oppgave = new Contender(monitor, alleTraaderFerdigBarriere);
      Thread traad = new Thread(oppgave);
      traad.start();
    }

    try {
      alleTraaderFerdigBarriere.await();
    } catch (InterruptedException e) {

    }
    System.out.println("Største tall: " + monitor.getLargest());
  }
}
