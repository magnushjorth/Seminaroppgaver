class Tallrekke {
  public static void main(String[] args) {
    int[] noenTall = new int[10];

    for (int i = 0; i < noenTall.length; i++) {
      noenTall[i] = i;
    }

    int sum = 0;

    for (int i = 0; i < noenTall.length; i++) {
      sum += i;
      System.out.println(noenTall[i] + " " + sum);
    }
  }
}
