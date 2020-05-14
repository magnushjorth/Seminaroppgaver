abstract class Drikke implements Drikkbar {
  protected int mengdeDL;
  protected final int MAKS_STORRELSE;

  public Drikke(int MAKS_STORRELSE) {
    this.mengdeDL = MAKS_STORRELSE;
    this.MAKS_STORRELSE = MAKS_STORRELSE;
  }

  @Override
  public void drikkGlass() {
    if (mengdeDL >= 2) {
      mengdeDL -= 2;
    } else {
      mengdeDL = 0;
    }
  }

  @Override
  public void fyllOpp() {
    mengdeDL = MAKS_STORRELSE;
  }

  @Override
  public String toString() {
    return
    "\nDRIKKE:\n" +
    mengdeDL + " dl\n" +
    MAKS_STORRELSE + " maks";
  }
}
