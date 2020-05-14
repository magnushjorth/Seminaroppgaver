class Fakultet {

  public static void main(String[] args) {
    System.out.println(fakultet(3));
  }

  static int fakultet(int n) {
    if (n == 1 || n == 0)
      return 1;

    return n * fakultet(n-1);
  }
} 
