import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 自己实现 ArrayList
 *
 */
public class MyArrayList {

    private Object[] elementData;
    private  int size;

    public MyArrayList() {
        this(10);
    }
    public MyArrayList(int capacity) {
        if (capacity<0) {
            try {
                throw new Exception();
            }catch (Exception e) {
                e.printStackTrace();
            }

        }
        elementData = new Object[capacity];
    }

    public void add(Object object){
        //数组扩容
        if(size == elementData.length) {
            Object[] tmp = new Object[2*size+1];
            System.arraycopy(elementData,0,tmp,0,elementData.length);
            elementData = tmp;
        }
        elementData[size++] = object;

    }
    public int getSize () {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public Object getIndex(int index){
        if (index <0 || index >= size) {
            try {
                throw new Exception();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return elementData[index];
    }
    public void remove(int index) {
        if (index < 0|| index>=size) {
            try {
                throw new Exception();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        //删除指定下标对象
        int num = size-1-index;
       System.arraycopy(elementData,index+1,elementData,index,num);
       elementData[--size] = null;
    }
    public void remove(Object object) {
        for (int i = 0; i < size ; i++) {
            if (getIndex(i).equals(object)) {
                remove(i);
            }
        }
    }
    public Object set(int index,Object object) {
        Object old = elementData[index];
        elementData[index] = object;
        return old;//返回被替换的对象
    }
    //在指定下标插入
    public void add(int index, Object obj){

    }
}
class Tmp {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(2);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        System.out.println(myArrayList.getSize());
        System.out.println(myArrayList.getIndex(2));
    }
}
