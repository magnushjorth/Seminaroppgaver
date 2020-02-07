import java.util.ArrayList;

class Hovedprogram {

  public static void main(String[] args) {
    Vare gulost = new Matvare(100, "Norvegia");
    Vare burn = new Energidrikk(20, "Burn", 2);
    Vare ol = new Alkohol(35, "Pils");
    ArrayList<Vare> varer = new ArrayList<>();
    varer.add(gulost);
    varer.add(burn);
    varer.add(ol);

    Kjoper nils = new Kjoper("Nils", 19, 200);
    Butikkansatt anne = new Butikkansatt("Anne", 20);

    nils.kjop(varer, anne);
  }
}
