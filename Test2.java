public Node mergeTowList(Node headA,Node headB) {
        Node node = new Node(-1);
        Node tmp = node;
        while (headA != null && headB != null) {
            if (headA.date < headB.date) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
            if (headA != null) {
                tmp.next = headA;
            }
            if (headB != null) {
                tmp.next = headB;
            }
        }
        return node.next;
}