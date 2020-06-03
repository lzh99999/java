/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if(listNode == null) {
            return list;
        }
        ListNode cur = listNode;
        while(cur != null) {
            list.add(0,cur.val);
            cur = cur.next;
        }
        return list;
    }
}