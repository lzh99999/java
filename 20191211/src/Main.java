import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList 里面有一个object类型的数组 默认10个  大于10会扩容
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        //底层实现 数组 查询快   线程不安全 效率高
        // Vector: 线程安全 效率低
        List list1 = new LinkedList();
        list.add(123);
        list.add("asd");
        list.set(0,"asdasdad");
        list.remove(123); //hashcode     equals
        System.out.println(list.size());
        System.out.println(list.get(0));

    }
}
