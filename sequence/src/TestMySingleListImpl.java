import mySingLeListImpl.MySingleListImpl;

public class TestMySingleListImpl {
    public static void main(String[] args) {
        MySingleListImpl mySingleList = new MySingleListImpl();
        mySingleList.addFirst(1);
        mySingleList.addLast(2);
        mySingleList.display();
        mySingleList.addindex(2,1);
        mySingleList.display();
        mySingleList.removeAllKey(1);
        mySingleList.display();
        if (mySingleList.remove(2) == 1) {
            System.out.println("删除成功！");
        }
        mySingleList.display();
        System.out.println("长度："+ mySingleList.getLength());
        mySingleList.clear();
        mySingleList.display();
    }
}
