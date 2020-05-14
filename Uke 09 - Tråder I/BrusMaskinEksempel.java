import java.util.Random;

public class BrusMaskinEksempel {
    public static void main(String[] args) {   
        Random random = new Random(12345);
        BrusMaskin brusMaskin = new BrusMaskin(8);
        
        Runnable kjopBrus = new Runnable() {
            public void run() {
                try {
                    for (int i = 0; i < 3; i++) {
                        Thread.sleep(Math.abs(random.nextInt() % 3));
                        brusMaskin.kjopBrus();
                    }
                } catch (InterruptedException e) {
                    System.out.println("Error");
                }
            }
        };

        Runnable fyllPaa = new Runnable() {
            public void run() {
                try {
                    for (int i = 0; i < 3; i++) {
                        Thread.sleep(Math.abs(random.nextInt() % 3));
                        brusMaskin.fyllOpp();
                    }
                } catch (InterruptedException e) {
                    System.out.println("Error");
                }
            }
        };

        for (int i = 0; i < 6; i++) new Thread(kjopBrus).start(); 

        new Thread(fyllPaa).start(); 
        System.out.println("Hovedprogram ferdig");
    }
}