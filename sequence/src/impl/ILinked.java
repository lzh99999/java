package impl;

public interface ILinked {
    //头插法
    void addFirst(int date);
    //尾插法
    void addLast(int date);
    //在任意位置插入，第一个数据节点为0号下标
    boolean addindex(int index,int date);
    //查找是否包含key在单链表中
    boolean contains(int key);
    //删除key第一次出现的节点
    int remove(int key);
    //删除所有值为key的节点
    void removeAllKey(int key);
    //得到单链表的长度
    int getLength();
    void display();
    void clear();
}
