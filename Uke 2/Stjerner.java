class Stjerner {
  public static void main(String[] args) {
    String[] stjerner = new String[10];

    String tegn = "*";

    for (int i = 0; i < stjerner.length; i++) {
      stjerner[i] = tegn;
      tegn += "*";
    }

    for (int i = 0; i < stjerner.length; i++) {
      System.out.println(stjerner[i]);
    }
  }
}
