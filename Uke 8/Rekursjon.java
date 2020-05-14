class Rekursjon {

  public static void main(String[] args) {
    rekursjon(5);
  }

  static void rekursjon(int tall) {
    if (tall == 0)
      return;
    System.out.println(tall);
    rekursjon(tall-1);
  }
}
