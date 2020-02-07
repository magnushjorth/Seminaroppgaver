import java.util.ArrayList;

abstract class Person {
  protected String navn;
  protected int alder;

  Person(String n, int a) {
    navn = n;
    alder = a;
  }

  @Override
  public String toString() {
    return navn + " er " + alder + " aar gammel.";
  }

  public String hentNavn() {
    return navn;
  }

  public int hentAlder() {
    return alder;
  }
}
