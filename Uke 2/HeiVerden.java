import java.util.Scanner;

class HeiVerden {
  public static void main(String[] args) {

    System.out.println("Hei! Hva heter du?");
    Scanner sc = new Scanner(System.in);
    String navn = sc.nextLine();

    System.out.println("Hei " + navn + "! Velkommen til IN1010.");
  }
}
