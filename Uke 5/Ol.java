public class Ol extends Drikke {

  public Ol(int MAKS_STORRELSE) {
    super(MAKS_STORRELSE);
  }

  @Override
  public void drikkGlass() {
    if (mengdeDL >= 5) {
      mengdeDL -= 5;
    } else {
      mengdeDL = 0;
    }
  }

  @Override
  public String toString() {
    return
    "\nOL:\n" +
    mengdeDL + " dl\n" +
    MAKS_STORRELSE + " maks";
  }
}
