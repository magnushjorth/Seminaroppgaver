public class Kommode extends Mobel {
  private int hoyde;
  private int skuffer;

  public Kommode(int v, int d, int b, int h, int s) {
    super(v, d, b);
    hoyde = h;
    skuffer = s;
  }

  @Override
  public int hentStorrelse() {
    return dybde * bredde * hoyde;
  }

  public void skrivSkuffer() {
    System.out.println("Antall skuffer: " + skuffer);
  }
}
