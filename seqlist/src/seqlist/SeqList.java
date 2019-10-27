package seqlist;
 interface SeqList {
// 打印顺序表    
 public void display() ;
// 在 pos 位置新增元素    
 public void add(int pos, int data);
// 判定是否包含某个元素    
 public boolean contains(int toFind);
// 查找某个元素对应的位置    
 public int search(int toFind);
// 获取 pos 位置的元素    
 public int getPos(int pos) ;
// 给 pos 位置的元素设为 value    
 public void setPos(int pos, int value) ;
// 删除第一次出现的关键字key    
 public void remove(int toRemove);
// 获取顺序表长度    
 public int size() ;
// 清空顺序表    
    public void clear() ;
}