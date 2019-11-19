import java.util.Arrays;

class Student implements Comparable<Student>{
    public String name;
    public int age;

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

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
        //return this.name.compareTo(o.name);
    }
}
public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[]{
                new Student("abe",13),
                new Student("bcd",15),
                new Student("aee",11)
        };
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));
    }

}
