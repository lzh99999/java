public Node midNode() {
        Node fast = this.head;
        Node low = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;
        }
        return low;
    }