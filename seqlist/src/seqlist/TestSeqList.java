package seqlist;

public class TestSeqList {
    public static void main(String[] args) {
        SeqListImpl seqList = new SeqListImpl();
        for (int i = 0; i < 6; i++) {
            seqList.add(i,i+1);
        }
        seqList.display();
        System.out.println("判断是否包含数字2："+seqList.contains(2));
        System.out.println(seqList.getPos(2));
        System.out.println(seqList.search(3));
        seqList.remove(2);
        seqList.display();
        seqList.remove(1);
        seqList.display();
        seqList.remove(3);
        seqList.display();
        seqList.clear();
        seqList.display();
    }
}
