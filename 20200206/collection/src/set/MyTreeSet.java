package set;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

/**
 * 描述:1.TreeSrt 实现了TreeSort接口 可以进行自然排序 TreeSet 内的元素必须时可比较的元素
 *  1）可以在TreeSet 构造方法中指定比较方式Comparator比较器
 *  2) 如果没有指定Comparator比较器，要求元素实现comparable接口
 *  2.TreeSet 底层是TreeMap
 *  3.向TreeSet中添加元素就是向TreeMap键中添加元素
 */
public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);//升序
               // return o2.compareTo(o1);//降序
            }
        });
        treeSet.add("nn");
        treeSet.add("bb");
        treeSet.add("cc");
        treeSet.add("dd");
        treeSet.add("ee");
        System.out.println(treeSet);

        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.addAll(treeSet);
        System.out.println(treeSet1);
    }
}
