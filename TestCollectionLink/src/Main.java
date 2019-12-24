import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class Main {
    public static void main(String[] args) {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ArrayList<Integer> ret = new ArrayList<>();
            while(listNode != null) {
                ret.add(listNode.val);
                listNode = listNode.next;
            }
            Collections.reverse(ret);
            return ret；
        }
    }
}
