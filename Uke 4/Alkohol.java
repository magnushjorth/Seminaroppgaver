class Alkohol extends Vare {
  private final int avg = 2; // Final - Konstrant som ikke kan endre

  Alkohol(int p, String n) {
    super(p, n);
  }

  @Override
  public int kjop() {
    return pris * avg;
  }

  @Override
  public String toString() {
    return "Varen " + navn + " koster " + (pris+avg);
  }
}
