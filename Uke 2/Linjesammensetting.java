import java.io.File;
import java.util.Scanner;

class Linjesammensetting {
  public static void main(String[] args) {
    String setning = "";
    Scanner fil = null;

    System.out.println("Hvilken fil skal leses?");
    Scanner sc = new Scanner(System.in);
    String filnavn = sc.nextLine();

    try {
      fil = new Scanner(new File(filnavn));
    } catch(Exception e) {
      System.exit(1);
    }

    while(fil.hasNextLine()) {
      setning += fil.nextLine() + " ";
    }

    System.out.println(setning);
  }
}
