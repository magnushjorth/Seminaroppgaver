public class Mobel {
  protected int vekt;
  protected int dybde;
  protected int bredde;

  public Mobel(int v, int d, int b) {
    vekt = v;
    dybde = d;
    bredde = b;
  }

  public int hentStorrelse() {
    return dybde * bredde;
  }
}
