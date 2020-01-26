package set;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * 描述:用TreeSet 存储自定义的类
 *一般情况下，让元素类实现comparable接口，实现通常的比较。使用comparator比较器
 * 一般是用于特殊的比较中使用
 */
public class Test2 {
    public static void main(String[] args) {
        TreeSet<Persom> treeSet = new TreeSet<>(new Comparator<Persom>() {
            @Override
            public int compare(Persom o1, Persom o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        treeSet.add(new Persom("qq",22));
        treeSet.add(new Persom("33",228));
        treeSet.add(new Persom("22",272));
        treeSet.add(new Persom("55",52));
        treeSet.add(new Persom("yy",32));
        System.out.println(treeSet);

        TreeSet<Persom> treeSet1 = new TreeSet<>();
        treeSet1.addAll(treeSet);
        System.out.println(treeSet1);
    }
}
class Persom implements Comparable<Persom>{
    String name;
    int age;

    @Override
    public String toString() {
        return "Persom{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persom persom = (Persom) o;
        return age == persom.age &&
                Objects.equals(name, persom.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Persom(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Persom() {

    }

    @Override
    public int compareTo(Persom o) {
        return this.name.compareTo(o.name);
    }
}
