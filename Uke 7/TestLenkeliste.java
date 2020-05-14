class TestLenkeliste {
  public static void main(String[] args) {
    Lenkeliste<String> liste = new Lenkeliste<>();

    liste.settInnPaaStarten("Hei");
    liste.settInnPaaStarten("Hello");
    liste.settInnPaaStarten("Hey");

    /*
    System.out.println(liste.fjernNodePaaStarten()); // Hey (Siste element som ble satt inn av "Hey")
    System.out.println(liste.fjernNodePaaStarten());
    System.out.println(liste.fjernNodePaaStarten());
    System.out.println(liste.fjernNodePaaStarten());
    */

    for (String data : liste) {
      System.out.println(data);
    }

  }
}
