public class Test {
    public static void main(String[] args) {
        TestSignalList testSignalList = new TestSignalList();
        testSignalList.addLast(1);
        testSignalList.addLast(1);
        testSignalList.addLast(2);
        testSignalList.addLast(2);
        testSignalList.addFirst(1);
        testSignalList.addIndex(0,4);
        testSignalList.display();
        System.out.println(testSignalList.size());
        testSignalList.display1(testSignalList.deleteDuplication());
      //  testSignalList.display1(testSignalList.baseX(4));
       // System.out.println(testSignalList.findReK(7).data);
       // System.out.println(testSignalList.midNode(testSignalList.head).data);
//        testSignalList.remove(5);
//        testSignalList.display();
          testSignalList.removeAllKey(5);
//        testSignalList.display();
//       Node node = testSignalList.reverseList();
//       testSignalList.display1(node);

    }
}
