class Hanoi {

  public static void main(String[] args) {
    hanoi(3, "A", "B", "C");
  }

  static void hanoi(int antallDisker, String A, String B, String C) {
    if (antallDisker == 0)
      return;
    hanoi(antallDisker-1, A, C, B);
    System.out.println("Flytter disk fra " + A + " til " + C);
    hanoi(antallDisker-1, B, A, C);
  }
}
