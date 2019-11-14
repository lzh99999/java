import org.omg.PortableServer.LIFESPAN_POLICY_ID;

public interface signalList {
//无头单向非循环链表实现
//头插法    
public void addFirst(int data);
//尾插法    
public void addLast(int data);
//任意位置插入,第一个数据节点为0号下标  
public void addIndex(int index,int data);
//查找是否包含关键字key是否在单链表当中  
public boolean contains(int key);
//删除第一次出现关键字为key的节点  
public void remove(int key);
//删除所有值为key的节点  
public void removeAllKey(int key);
//得到单链表的长度    
public int size();
public void display();
public void clear();
// 2. 反转一个单链表。
public Node reverseList();
// 3. 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点。
public Node midNode(Node head);
// 4. 输入一个链表，输出该链表中倒数第k个结点。
public Node findReK(int k);
// 5. 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
public Node mergeList(Node headA,Node headB);
//  6. 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前 。
public Node baseX(int x);
// 7. 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
public Node deleteDuplication();
//8. 链表的回文结构。
public boolean palindromeList();
// 9,输入两个链表，找出它们的第一个公共结点。
public Node publicNode(Node headA,Node headB);
// 10. 给定一个链表，判断链表中是否有环。
public boolean cycleList(Node head);
// 11. 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
public Node detectCycle(Node head);
//带有随机指针的复制
public ListNode copyRandomList(ListNode head);
}
