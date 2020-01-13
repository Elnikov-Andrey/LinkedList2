import java.util.Objects;

public class LinkedList2 {
    private int lastIndex = -1;
    private Node root = new Node(lastIndex, null);
    private Node lastElem = root;

    public void add(Object o) {
        Node current = new Node(++lastIndex, o);
        lastElem.setNext(current);
        lastElem = current;
    }

    public Object get (int i){
        Node current = root.getNext();
        while (current != null) {
            System.out.println("Element" + current.getIndex());
            if (current.getIndex() == i){
                return current.getContent();
            }
            current = current.getNext();
        }
        return null;
    }

    private class Node{

        private Node next;
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }

        private int index;
        public int getIndex() {
            return index;
        }
        public void setIndex(int index) {
            this.index = index;
        }

        private Object content;

        public Node(int index, Object content){

        }

        public Object getContent(){
            return content;
        }

    }
}
