
/**
 * 于是在与乌龟的比赛中，一旦任一秒结束后兔子发现自己领先t米或以上，
 * 它们就会停下来休息s秒。对于不同的兔子，t，s的数值是不同的，
 * 但是所有的乌龟却是一致——它们不到终点决不停止
 * 描述:兔子的速度v1（表示每秒兔子能跑v1米），
 * 乌龟的速度v2，以及兔子对应的t，s值，
 * 以及赛道的长度l
 * 输入只有一行，包含用空格隔开的五个正整数v1，v2，t，s，l，
 * 其中(v1,v2<=100;t<=300;s<=10;l<=10000且为v1,v2的公倍数)
 * 输出包含两行，第一行输出比赛结果——一个大写字母“T”或“R”或“D”，
 * 分别表示乌龟获胜，兔子获胜，或者两者同时到达终点。
 * 　　第二行输出一个正整数，表示获胜者（或者双方同时）到达终点所耗费的时间（秒数）。
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();
        int l = sc.nextInt();
        int wu = 0;
        int tu = 0;
        int time = 0;

        for (int i = 1; i <= l; i++) {
            if (tu - wu < t) {
                wu += v2;
                tu += v1;
            } else {
                i--;
                for (int j = 1; j <= s ; j++) {
                    wu+=v2;
                    i++;
                    if (wu == l) {
                        time = i;
                        break;
                    }
                }
            }
            if (wu == l || tu == l) {
                time = i;
                break;
            }
        }
        if (wu==l &&wu>tu) {
            System.out.println("T");
        }else if (tu == l && tu >wu){
            System.out.println("R");
        }else {
            System.out.println("D");
        }
        System.out.println(time);
    }
}
