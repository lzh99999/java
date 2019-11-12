 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

 class Solution {
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null) {
            return null;
        }
        if(pHead.next == null) {
            return pHead;
        }
        ListNode cur = pHead;
        ListNode node = new ListNode(-1);
        ListNode tmp = node;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = null;
            if(cur.val == curNext.val) {
                while(cur.val == curNext.val ) {
                    cur = curNext;
                    if(cur != null){
                        curNext = curNext.next;
                    }

                }
                cur = curNext;
            }else{
                tmp.next = cur;
                tmp = tmp.next;
                cur = curNext;
            }
        }
        return node.next;
    }
}



