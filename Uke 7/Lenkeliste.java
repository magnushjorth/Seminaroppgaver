import java.util.Iterator;

class Lenkeliste<T> implements Iterable<T> {
  private class Node {
    T data;
    Node neste;

    Node(T data) {
      this.data = data;
    }
  }

  private Node start;

  public void settInnPaaStarten(T data) {
    if (start == null) {
      start = new Node(data);
    } else {
      Node node = new Node(data);
      node.neste = start;
      start = node;
    }
  }
  public T fjernNodePaaStarten() {
    if (start == null) {
      return null;
    } else {
      Node returNode = start;
      start = start.neste;
      return returNode.data;
    }
  }

  public Iterator<T> iterator() {
    return new ListeIterator();
  }

  private class ListeIterator implements Iterator<T> {

    Node current = start;

    public boolean hasNext() {
      if (current == null) {
        return false;
      }
      return true;
    }

    public T next() {
      if (hasNext()) {
        T data = current.data;
        current = current.neste;
        return data;
      }
      return null;
    }

    public void remove() {
      throw new UnsupportedOperationException("Remove is not implemented");
    }
  }
}

//while (hasNext()) {
//  next();
//}
