package list;

import java.util.*;

/**
 * 描述:分别用list/set实现存储10个不同的随机整数100以内的
 */
public class Test {
    public static void main(String[] args) {

        //使用list实现
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        while (list.size() < 10) {
            int r = random.nextInt(100);
            if (!list.contains(r))
            list.add(r);
        }
        System.out.println(list);

        //使用set实现
        Set<Integer> set = new HashSet<>();
        while (set.size() < 10) {
            set.add(random.nextInt(100));
        }
        System.out.println(set);

        //遍历set  使用迭代器
        Iterator<Integer> iterator =  set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("next = " + next);
        }
    }
}
