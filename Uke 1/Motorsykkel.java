class Motorsykkel {
  private int kilometerstand;
  private String registeringsnummer;
  private int produksjonsnummer;

  private static int teller = 0;

  public Motorsykkel(String regnr) {
    this.kilometerstand = 0;
    registeringsnummer = regnr;

    this.produksjonsnummer = teller;
    teller++;
  }

  public int hentKilometerstand() {
    return kilometerstand;
  }

  public int hentProduksjonsnummer() {
    return produksjonsnummer;
  }

  public void kjoer(int antallKilometer) {
    kilometerstand += antallKilometer;
  }
}
