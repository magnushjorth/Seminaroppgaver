public class Hovedprogram {
  public static void main(String[] args) {
    Mobel m = new Mobel(10, 20, 30);
    Sofa s = new Sofa(20, 50, 70, 4);
    Kommode k = new Kommode(20, 20, 30, 80, 5);

    Mobel m2 = (Mobel) s; //Sofa tolkes som en møbel

    System.out.println(m.hentStorrelse());
    s.antallSitteplasser();
    System.out.println(k.hentStorrelse());
    k.skrivSkuffer();

    m.dybde = 50;
    System.out.println(m.hentStorrelse());
  }
}
