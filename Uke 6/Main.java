class Main {
  public static void main(String[] args) {
    Node start = new Node("Hei");
    Node nyNode = new Node("på");
    start.settNeste(nyNode);
    nyNode.settNeste(new Node("deg"));

    System.out.println(start.hentNeste().hentNeste().hentData());

    Node node = start;
    while(node != null) { // iterer gjennom
      System.out.println(node.hentData());
      node = node.hentNeste();
    }

    System.out.println("");

    Boks<String> nyBoks = new Boks<String>("Hei");
    Boks<Integer> intBoks = new Boks<Integer>(1);


    System.out.println(nyBoks.hentData()); 
    System.out.println(intBoks.hentData());
  }
}
