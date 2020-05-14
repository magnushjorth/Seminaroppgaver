import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BrusMaskin {


    int kapasitet;
    int brusAntall;

    Lock laas = new ReentrantLock();

    Condition maaFylles = laas.newCondition();
    Condition maaTommes = laas.newCondition();

    public BrusMaskin(int kap) {
        kapasitet = kap;
    }

    public void kjopBrus() {
        System.out.println("Prøver å kjøpe");
        laas.lock();
        System.out.println("Jeg kjøper nå");
        try {
            while (brusAntall == 0) maaFylles.await();
            brusAntall--;
            System.out.println("Vi kjøpte en brus, det er så mange igjen " + brusAntall);
            if (brusAntall == 0) maaTommes.signal();
        } catch (InterruptedException e) {
            System.out.println("Error");
        } finally {
            laas.unlock();
        }
    }

    public void fyllOpp() {
        laas.lock();
        try {
            while (brusAntall > 0) maaTommes.await();
            brusAntall = kapasitet;
            System.out.println("Vi fylte opp");
            maaFylles.signalAll();  
        } catch (InterruptedException e) {
            System.out.println("Error");
        } finally {
            laas.unlock();
        }
    }
}