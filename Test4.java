//����Ļ��Ľṹ
    public boolean palinadrome() {
        Node fast = this.head;
        Node slow = this.head;
        //���м�
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //��ת�������벿��
        Node p = slow.next;
        while (p != null) {
            Node pNext = p.next;
            p.next = slow;
            slow = p;
            p = pNext;
        }
        //�ж��Ƿ����
        while (this.head.date == slow.date) {
            this.head = this.head.next;
            slow = slow.next;
            //ż��
            if (this.head.next == slow) {
                return true;
            }
            //����
            if (this.head == slow) {
                return true;
            }
        }
        return false;
    }