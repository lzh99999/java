public class Test {
    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        doubleList.addFirst(12);
        doubleList.addFirst(1);
        doubleList.addFirst(1);
        doubleList.addFirst(1);
        doubleList.addFirst(1);
        doubleList.display();
//        doubleList.addIndex(5,1);
//        doubleList.display();
//        doubleList.remove(1);
//        doubleList.display();
//        doubleList.removeAllKey(1);
        //  doubleList.display();
        doubleList.clear();
        System.out.println("=====");
    }
}
