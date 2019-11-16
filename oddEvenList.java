/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode j = null;
        ListNode jN = j;
        ListNode o = null;
        ListNode oN= o;
        ListNode cur = head;
        int count = 1;
        while(cur != null) {
            if(count% 2 !=0) {
                if(j == null) {
                    j = cur;
                    jN = cur;
                }else{
                    jN.next = cur;
                    jN = jN.next;
                }
            }else {
                if(o == null){
                    o =cur;
                    oN = cur;
                }else {
                    oN.next = cur;
                    oN = oN.next;
                }
            }
            count++;
            cur = cur.next;
        }
        if(oN != null) {
        oN.next = null;
        }
        jN.next = null;
        if(j == null) {
            return o;
        }else{
            jN.next = o;
            return j;
        }
    }
}