public class Sofa extends Mobel {
  private int sitteplasser;

  public Sofa(int v, int d, int b, int s) {
    super(v, d, b);
    sitteplasser = s;
  }

  public void antallSitteplasser() {
    System.out.println("Antall plasser: " + sitteplasser);
  }
}
