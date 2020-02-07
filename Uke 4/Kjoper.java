import java.util.ArrayList;

class Kjoper extends Person {
  private int penger;

  Kjoper(String n, int a, int p) {
    super(n, a);
    penger = p;
  }

  public int kjop(ArrayList<Vare> varer, Butikkansatt ansatt) {
    int kjopSum = 0;

    try {
      kjopSum += ansatt.selg(varer, this);
    }
    catch (Exception e) {
      System.out.println(e);
    }

    if (penger > kjopSum) {
      System.out.println(navn + " har kjopt varer for " + kjopSum + " kr");
      penger -= kjopSum;
      System.out.println(navn + " har naa " + penger + " kr");
    }

    else {
      System.out.println(navn + " har ikke raad. ");
    }

    return kjopSum;
  }
}
