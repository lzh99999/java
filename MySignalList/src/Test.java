public class Test {
    public static void main(String[] args) {
        MySignalList mySignalList = new MySignalList();
        MySignalList mySignalList1 = new MySignalList();
        mySignalList.addLast(1);
        mySignalList.addLast(2);
       // mySignalList.addLast(3);
        mySignalList.addLast(4);
        mySignalList.addLast(13);
        mySignalList.display();
      //  System.out.println(mySignalList.chkPalinadrome());

        mySignalList1.addLast(1);
        mySignalList1.addLast(43);
        // mySignalList.addLast(3);
        mySignalList1.addLast(44);
        mySignalList1.addLast(1);
        mySignalList1.display();

    }
}
