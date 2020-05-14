class testDrikke {
  public static void main(String[] args) {
    Ol ol = new Ol(15);

    ol.drikkGlass();
    System.out.println(ol);
    ol.drikkGlass();
    ol.drikkGlass();
    System.out.println(ol);
    ol.fyllOpp();
    System.out.println(ol);
  }
}
