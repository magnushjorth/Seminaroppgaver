// Ikke fullverdig kode, kun skallet

class SortertLenkeliste<T extends CompareTo<T>> {

  private class Node{}

  Node start;

  public leggTil(T data) {
    Node node = start;
    while (node.data.compareTo(data) > 0) {
      // gå videre
    }
    // ny peker på neste
    // før peker på ny
  }

  public T fjern(int i) {
    //passe på at forrige peker på neste neste

  }
}
