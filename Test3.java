
    //����һ�������ж��������Ƿ��л�
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