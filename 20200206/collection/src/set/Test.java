package set;

import java.util.HashSet;
import java.util.Objects;

/**
 * 描述:使用HashSet 存储自定义的类 使用contains方法时会调用equals方法
 * 需要重写 equals方法和HashCode
 */
public class Test {
    public static void main(String[] args) {
        HashSet<Student> hashSet= new HashSet<>();
        hashSet.add(new Student("11",20));
        hashSet.add(new Student("22",21));
        hashSet.add(new Student("33",22));
        hashSet.add(new Student("44",23));
        System.out.println(hashSet);

        for (Student student : hashSet) {
            System.out.println(student);
        }

        Student stu = new Student("11",20);
        System.out.println(hashSet.contains(stu));
    }
}

class Student {
    String name;
    int age;

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}