import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
        if(A == null || A.next == null) {
            return true;
        }
        ListNode cur = A;
        ListNode fast = A;
        ListNode slow = A;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode p = slow.next;
        while(p != null) {
            ListNode pNext = p.next;
            p.next = slow;
            slow = p;
            p = pNext;
        }
        while(cur != null) {
            if(cur.val != slow.val) {
                return false;
            }
                cur = cur.next;
                slow = slow.next;
            if(cur.next == slow && cur.val == slow.val) {
                return true;
            }
            if(cur == slow) {
                return true;
            }
            
        }
        return false;
    }
}