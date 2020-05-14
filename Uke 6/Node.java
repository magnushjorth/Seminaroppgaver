class Node {
  private Node neste;
  private String data;

  public Node(String data) {
    this.data = data;
  }

  public void settNeste(Node node) {
    neste = node;
  }

  public Node hentNeste() {
    return neste;
  }

  public String hentData() {
    return data;
  }
}
