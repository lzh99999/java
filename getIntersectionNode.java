public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        ListNode pL = headA;
        ListNode pS = headB;
        int lenA = 0;
        int lenB = 0;
        while(pL != null) {
            lenA++;
            pL = pL.next;
        }
         while(pS != null) {
            lenB++;
            pS = pS.next;
        }
        pL = headA;
        pS = headB;
        int len = lenA - lenB;
        if(len < 0) {
            len = -len;
            pL = headB;
            pS = headA;
        }
        while(len > 0) {
            pL = pL.next;
            len--;
        }
        while( pL != pS) {
            pL = pL.next;
            pS = pS.next;
        }
        return pL;
    }
}