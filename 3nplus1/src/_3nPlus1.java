/*鑰冭檻濡備笅鐨勫簭鍒楃敓鎴愮畻娉曪細浠庢暣鏁� n 寮�濮嬶紝濡傛灉 n 鏄伓鏁帮紝鎶婂畠闄や互 2锛涘鏋� n 鏄鏁帮紝
 鎶婂畠涔� 3 鍔�1銆傜敤鏂板緱鍒扮殑鍊奸噸澶嶄笂杩版楠わ紝鐩村埌 n = 1 鏃跺仠姝€�備緥濡傦紝n = 22 鏃惰绠楁硶鐢熸垚鐨勫簭鍒楁槸锛�
22锛�11锛�34锛�17锛�52锛�26锛�13锛�40锛�20锛�10锛�5锛�16锛�8锛�4锛�2锛�1
浜轰滑鐚滄兂锛堟病鏈夊緱鍒拌瘉鏄庯級瀵逛簬浠绘剰鏁存暟 n锛岃绠楁硶鎬昏兘缁堟浜� n = 1銆�
 杩欎釜鐚滄兂瀵逛簬鑷冲皯 1 000 000鍐呯殑鏁存暟閮芥槸姝ｇ‘鐨勩��
瀵逛簬缁欏畾鐨� n锛岃搴忓垪鐨勫厓绱狅紙鍖呮嫭 1锛変釜鏁拌绉颁负 n 鐨勫惊鐜妭闀垮害銆�
 鍦ㄤ笂杩颁緥瀛愪腑锛�22 鐨勫惊鐜妭闀垮害涓� 16銆傝緭鍏ヤ袱涓暟 i 鍜� j锛�
 浣犵殑浠诲姟鏄绠� i 鍒� j锛堝寘鍚� i 鍜� j锛変箣闂寸殑鏁存暟涓紝寰幆鑺傞暱搴︾殑鏈�澶у�笺��*/
import java.util.Scanner;
public class _3nPlus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int a = i;
            int b = j;
            //涓�鐩磋a涓篴鍜宐涓殑杈冨皬鍊�
            if (i > j) {
                a = j;
                b = i;
            }
            int max = -1;
            for (int k = a; k <= b; k++) {
                int sum = f(k);
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println(i + " " + j + " " + max);
        }
    }

//寰幆鑺傞暱搴�
    static int f(long k) {

        int count = 1;

        while (k != 1) {

            if ((k & 1) == 0) {

                k /= 2;

            } else {

                k = k * 3 + 1;

            }

            count++;

        }

        return count;

    }

}