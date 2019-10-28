package Sequencelmpel;

import impl.ISequence;

import java.util.Arrays;

public class SequenceImpl  implements ISequence {
    private Object[] elemDate;
    private int usedSize;
    public static final int DEFAULT_CAPACITY = 10;

    public SequenceImpl() {
        this.elemDate = new Object[DEFAULT_CAPACITY];
        this.usedSize = 0;
    }
//判断数组是否为满
    private boolean isFull() {
        return this.usedSize == this.elemDate.length;
    }
    //在pos位置插入date
    @Override
    public boolean add(int pos, Object date) {
        if (pos < 0 || pos > this.usedSize ) {
            return false;
        }
        if ( isFull()){
            //扩容
            this.elemDate = Arrays.copyOf(this.elemDate,this.elemDate.length*2);
        }
        for (int i = this.usedSize - 1; i >= pos; i--) {
            elemDate[i + 1] = elemDate[i];
        }
        this.elemDate[pos] = date;
        this.usedSize++;
        return true;
    }
    private boolean isEmpty() {
        return this.usedSize == 0;
    }
    public int search(Object key) {
        if (key == null ){
            throw new UnsupportedOperationException("不可以传入null");
        }
        if (isEmpty()) {
            return -1;
        }
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elemDate[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    public boolean comtains(Object key) {
        if (key == null ){
            throw new UnsupportedOperationException("不可以传入null");
        }
        if (isEmpty()) {
            System.out.println("数组为空");
            return false;
        }
        for (int i = 0; i < this.usedSize ; i++) {
            if (this.elemDate[i].equals(key)) {
                return true;
            }
        }
        return false;
    }
    public Object remove(Object pos) {
        if (search(pos)==-1) {
            return null;
        }
        int index = search(pos);
        int i = 0;
        for (i = index; i < this.usedSize-1; i++) {
            this.elemDate[i] = this.elemDate[i+1];
        }
        this.elemDate[i+1] = null;
        this.usedSize--;
        return this.elemDate;
    }
    public void clear() {
        for (int i = 0; i < this.usedSize; i++) {
            this.elemDate[i] = null;
        }
        this.usedSize = 0;
    }
}
