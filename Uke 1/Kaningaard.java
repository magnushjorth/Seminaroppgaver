class Kaningaard {
  private Kanin[] kaniner = new Kanin[100];

  public boolean full() {
    if (kaniner.length == 100) return true;
    return false;
  }

  public boolean tom() {
    if (kaniner.length == 0) return true;
    return false;
  }

  public Kanin finnEn(String navn) {
    int i = 0;
    boolean funnet = false;
    while (i < kaniner.length && !funnet) {
      if (kaniner[i].hentNavn().equals(navn)) {
        funnet = true;
        return kaniner[i];
      }
    }
    return null;
  }

  public void settInn(Kanin kanin) {
    if (finnEn(kanin.hentNavn()) != null) {
      System.out.println("Kaninen finnes alt i Kaningaard!");
    } else if (full()) {
      System.out.println("Det er ikke plass til flere kaniner!");
    } else {

      boolean sattInn = false;
      int teller = 0;

      while (teller < kaniner.length && !sattInn) {
        if (kaniner[teller] == null) {
          kaniner[teller] = kanin;
          sattInn = true;
        }
        teller++;
      }
    }
  }

  public void fjern(String navn) {
    boolean funnet = false;
    int teller = 0;

    while (tellre < kaniner.length && !funnet) {
      if (kaniner[teller] != null && kaniner[teller].hentNavn().equals(navn)) {
        kaniner[teller] = null;
        funnet = true;
      }
      teller++;
    }
    if (!funnet) {
      System.out.println("Fant ikke kaninen " + navn + ".");
    }
  }
}
