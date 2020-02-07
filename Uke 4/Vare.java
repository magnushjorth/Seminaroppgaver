abstract class Vare {
  protected int pris;
  protected String navn;

  Vare(int p, String n) {
    pris = p;
    navn = n;
  }

  public String hentNavn() {
    return navn;
  }

  public int kjop() {
    return pris;
  }

  @Override
  public String toString() {
    return "Varen " + navn + " koster " + pris;
  }
}
