import java.util.Random;

class Barista implements Runnable {
  private final String drikker = {"Americano", "Cafe au lait", "Caffe latte",
  "Caffe mocca", "Espresso", "Cortado"};

  private Bord bord;
  private id;
  private static int idGen;

  public Barista(Bord bord) {
    this.bord = bord;
    this.id = idGen++;
  }

  @Override
  public void run() {
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      String kaffe = drikker(random.nextInt(drikker.length()));
      System.out.println("Barista ");
    }
  }
}
