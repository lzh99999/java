public class MyLinkList {
    private Node first;
    private Node last;
    private int size;

    public void add(Object obj) {
        if (first == null) {
            Node node = new Node();
            node.setNext(null);
            node.setPrevious(null);
            node.setObject(obj);
            first = node;
            last = node;
        }else {
           Node node = new Node();
           node.setPrevious(last);
           last.setNext(node);
           node.setObject(obj);
            node.setNext(null);

            last = node;
        }
        size++;
    }
    public int getSize() {
        return size;
    }
    public Object getIndex(int index) {
        if (index <0 || index>size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (first == null) {
            return null;
        }else {
            Node cur = first;
            for (int i = 0; i <index ; i++) {
                cur = cur.getNext();
            }
            return cur.getObject();
        }
    }

   /* public void remove(int index) {
        if (first != null) {
            Node cur = first;
            for (int i = 0; i <index ; i++) {
                cur = cur.getNext();
            }
            if (cur != null) {
                Node up = cur.getPrevious();
                Node dowm = cur.getNext();
                up.setNext(dowm);
                dowm.setPrevious(up);
            }
             size--;
        }
    }*/

}
class Test {
    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.add(1111);
        myLinkList.add(112);
        myLinkList.add(131);
        System.out.println(myLinkList.getIndex(0));
//        myLinkList.remove(2);
      System.out.println(myLinkList.getIndex(1));
    }
}
class Node {
    private Object object;
    private Node previous;
    private Node next;

    public Node() {
    }

    public Node(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
