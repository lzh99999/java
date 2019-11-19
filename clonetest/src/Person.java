class Money implements Cloneable{
    int size = 33;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable {
    public String name;
    public Money money;

    @Override
    protected Object clone() throws CloneNotSupportedException {
     Person p = (Person) super.clone();
     p.money = (Money) money.clone();
     return p;
    }

    public Person(String name) {
        this.name = name;
        this.money = new Money();
    }

}
 class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("asd");
        Person person2 = (Person) person.clone();
        person2.money.size = 99;
        System.out.println(person.money.size);
        System.out.println(person2.money.size);
    }
}
