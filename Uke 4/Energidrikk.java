class Energidrikk extends Vare {
  private int pant;

  Energidrikk(int p, String n, int pnt) {
    super(p, n);
    pant = pnt;
  }

  @Override
  public int kjop() {
    return pris + pant;
  }

  @Override
  public String toString() {
    return "Varen " + navn + " koster " + (pris+pant);
  }
}
