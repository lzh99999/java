package seqlist;

import java.util.Arrays;

public class SeqListImpl implements SeqList {
    private int[] elemant;
    private int usedSide;

    public SeqListImpl() {
        this.elemant = new int[10];
        this.usedSide = 0;
    }
    // 打印顺序表  
    @Override
    public void display() {
        if (this.isEmpty()) {
            System.out.println("顺序表为空！");
        }
        for (int i = 0; i <this.usedSide ; i++) {
            System.out.print(this.elemant[i]+" ");
        }
        System.out.println();
    }
    //判断数组是否满
    private boolean isFull() {
        return this.usedSide == this.elemant.length;
    }

    // 在 pos 位置新增元素
    @Override
    public void add(int pos, int data) {
        //判断pos的合法性
        if (pos < 0 || pos > this.usedSide) {
            System.out.println("输入不合法！");
        }
        //如果为满，使原来数组扩大为原来的2倍
        if (isFull()) {
            this.elemant = Arrays.copyOf(this.elemant,this.elemant.length*2);
        }
        //使pos之后的元素都向后移动
        for (int i = usedSide - 1; i >=pos ; i--) {
            elemant[i+1] = elemant[i];
        }
        elemant[pos] = data;
        usedSide++;
    }
    // 判定是否包含某个元素  
    @Override
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSide; i++) {
            if (elemant[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    //判断是否为空
    public boolean isEmpty() {
        return this.usedSide == 0;
    }
    // 查找某个元素对应的位置
    @Override
    public int search(int toFind) {
        if (isEmpty()) {
            return -1;
        }
        for (int i = 0; i < this.usedSide; i++) {
            if (elemant[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    // 获取 pos 位置的元素  
    @Override
    public int getPos(int pos) {
        return this.elemant[pos];
    }
    // 给 pos 位置的元素设为 value    
    @Override
    public void setPos(int pos, int value) {
        elemant[pos] = value;
    }
    // 删除第一次出现的关键字key    
    @Override
    public void remove(int key) {
        if (contains(key)) {
            int index = search(key);
            for (int i = index; i < this.usedSide -1; i++) {
                this.elemant[i] = this.elemant[i+1];
            }
            this.elemant[this.usedSide - 1] = 0;
            this.usedSide--;
        }
    }
    // 获取顺序表长度
    @Override
    public int size() {
        return this.elemant.length;
    }
    // 清空顺序表
    @Override
    public void clear() {
        for (int i = 0; i < this.usedSide ; i++) {
            this.elemant[i] = 0;
        }
        this.usedSide = 0;
    }
}
