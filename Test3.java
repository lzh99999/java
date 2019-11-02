
    //给定一个链表，判断链表中是否有环
    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
       while (fast != null && fast.next != null) {
           fast = fast.next.next;
           slow = slow.next;
           if (fast == slow) {
               return true;
           }
       }
       return false;
    }