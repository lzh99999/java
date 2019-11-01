public class NoHeadTowListTest {
    public static void main(String[] args) {
        NoHeadTowListImpl noHeadTowList = new NoHeadTowListImpl();
        noHeadTowList.addIndex(0,2);
        noHeadTowList.addFirst(1);
        noHeadTowList.addFirst(1);
        noHeadTowList.addLast(3);
        noHeadTowList.addIndex(0,2);
        noHeadTowList.addIndex(noHeadTowList.size(),2);
        System.out.println(noHeadTowList.size());
        noHeadTowList.display();
        System.out.println(noHeadTowList.contains(2));
        noHeadTowList.removeAllKey(1);
        noHeadTowList.display();
        noHeadTowList.remove(2);
        noHeadTowList.display();
        noHeadTowList.clear();
        noHeadTowList.display();
    }
}
