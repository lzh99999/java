import java.util.*;

/**
 * 描述:
 * 标题：日期问题
 * 小明正在整理一批历史文献。这些历史文献中出现了很多日期。
 * 小明知道这些日期都在1960年1月1日至2059年12月31日。令小明头疼的是，
 * 这些日期采用的格式非常不统一，有采用年/月/日的，有采用月/日/年的，
 * 还有采用日/月/年的。更加麻烦的是，年份也都省略了前两位，使得文献上的一个日期，
 * 存在很多可能的日期与其对应。
 * 比如02/03/04，可能是2002年03月04日、2004年02月03日或2004年03月02日。
 * 给出一个文献上的日期，你能帮助小明判断有哪些可能的日期对其对应吗？
 * 输入
 * ----
 * 一个日期，格式是"AA/BB/CC"。  (0 <= A, B, C <= 9)
 * 输入
 * ----
 * 输出若干个不相同的日期，每个日期一行，格式是"yyyy-MM-dd"。
 * 多个日期按从早到晚排列。
 * 样例输入
 * ----
 * 02/03/04
 * 样例输出
 * ----
 * 2002-03-04
 * 2004-02-03
 * 2004-03-02
 * 资源约定：
 * 峰值内存消耗（含虚拟机） < 256M
 * CPU消耗  < 1000ms
 * 请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。
 * 所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
 * 不要使用package语句。不要使用jdk1.7及以上版本的特性。
 * 主类的名字必须是：Main，否则按无效代码处理。
 */
public class Main {
    static String aa, bb, cc;
    static HashSet<Integer> has = new HashSet<>();
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split("/");//分割获取年月日
        aa = split[0];
        bb = split[1];
        cc = split[2];
        //年月日
        getData(aa, bb, cc);
        //月日年
        getData(cc, aa, bb);
        //日月年
        getData(cc, bb, aa);

        list.addAll(has);

        Collections.sort(list);

        for (int i : list) {
            System.out.println((""+i).substring(0,4)+"-"+
                    (""+i).substring(4,6)+"-"+(""+i).substring(6,8));
        }
    }

    private static void getData(String aa, String bb, String cc) {
        int a = 0;
        if (Integer.parseInt(aa) >= 0 && Integer.parseInt(aa) <= 59) {
            a = Integer.parseInt(("20" + aa));
        } else {
            a = Integer.parseInt(("19" + aa));
        }
        int b = Integer.parseInt(bb);
        int c = Integer.parseInt(cc);

        if ((a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) && b == 2 && c > 0 && c <= 29) {
            has.add(Integer.parseInt(a + bb + cc + ""));
        }
        if (a % 4 != 0 && b == 2 && c >= 0 && c < 29) {
            has.add(Integer.parseInt(a + bb + cc + ""));
        }
        if ((b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12) && c > 0 && c <= 31) {
            has.add(Integer.parseInt(a + bb + cc + ""));
        }
        if ((b == 4 || b == 6 || b == 9 || b == 11) && c > 0 && c <= 30){
            has.add(Integer.parseInt(a + bb + cc + ""));
        }
    }
}
