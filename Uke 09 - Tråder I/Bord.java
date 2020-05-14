import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.*;

class Bord {
  private ArrayList<String> bord = new ArrayList<>();
  private Lock laas = new ReentrantLock;
  private Condition ingenKaffe = laas.newCondition();
  private int antallFerdige = 0;
  private int antallBarista;

  public Bord(int antallBarista) {
    this.antallBarista = antallBarista;
  }

  public void server(String kaffe) {
    laas.lock();
    try {
      if (kaffe.equals("tomt")) {
        antallFerdige++;
      } else {
        bord.add(kaffe);
      }
      erKaffe.signalAll();

    } finally {
      laas.unlock();
    }
  }

  public String hentKaffe() {
    laas.lock();
    try {
      while(bord.isEmpty()) {
        if (antallFerdige = antallBarista) {
          erkaffe.signalAll();
        }
        erKaffe.await();
      }

      return bord.remove(0);
    } catch (InterruptedException e) {
      System.out.println("Jeg ble avbrutt under henting av kaffe");
    } catch (Exception e) {

    } finally {
      laas.unlock();
    }
  }

}
