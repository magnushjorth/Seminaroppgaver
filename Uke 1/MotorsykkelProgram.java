class MotorsykkelProgram {
  public static void main(String[] args) {
    Motorsykkel m1 = new Motorsykkel("ES7006");

    int teller = 0;
    while (teller < 5) {
      m1.kjoer(10);
      teller++;
    }

    System.out.println("M1: " + m1.hentKilometerstand()); // 50


    Motorsykkel m2 = new Motorsykkel("BJ5204");
    Motorsykkel m3 = new Motorsykkel("AA6901");

    System.out.println("M2: " + m2.hentProduksjonsnummer()); // 1
    System.out.println("M3: " + m3.hentProduksjonsnummer()); // 2

  }
}
