//汉诺塔
public class TestHanoi {

    public static void main(String[] args) {
        Hanoi(5,'A','B','C');

    }
    public static void Hanoi(int n,char from,char in,char to) {
        if(n==1) {
            System.out.println("将第1个盘子从"+from+"移动"+to);
        }
        else {
            Hanoi(n-1,from,to,in);
            System.out.println("将第"+n+"个盘子"+from+"移动"+to);
            Hanoi(n-1,in,from,to);
        }
    }



}
