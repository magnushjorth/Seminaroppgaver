class Person {
  private int alder;
  private String navn;

  public Person(int alder, String navn) {
    this.alder = alder;
    this.navn = navn;
  }

  public void skrivUt() {
    System.out.println(navn + " " + alder);
  }

  public void haBursdag() {
    alder++;
  }
}
