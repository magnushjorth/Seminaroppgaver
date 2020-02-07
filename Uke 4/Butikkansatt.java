import java.util.ArrayList;

class Butikkansatt extends Person {

  Butikkansatt(String n, int a) {
    super(n, a);
  }

  public int selg(ArrayList<Vare> varer, Kjoper k) throws Exception {
    int totalSum = 0;

    for (Vare v : varer) {
      if (v instanceof Alkohol && alder < 18) {
        throw new Exception(navn + " er for ung til aa selge alkohol. ");
      }
      else if (v instanceof Alkohol && k.hentAlder() < 18) {
        throw new Exception(k.hentNavn() + " er for ung til aa kjope alkohol. ");
      }
      else if (v instanceof Energidrikk && k.hentAlder() < 16) {
        throw new Exception(k.hentNavn() + " er for ung til aa kjope energidrikk. ");
      }
      else {
        totalSum += v.kjop();
      }
    }
    return totalSum;
  }
}
