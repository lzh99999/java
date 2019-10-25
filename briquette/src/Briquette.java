public class Briquette {
    /*
    煤球数目

    有一堆煤球，堆成三角棱锥形。具体：
    第一层放1个，
    第二层3个（排列成三角形），
    第三层6个（排列成三角形），
    第四层10个（排列成三角形），
            ....
    如果一共有100层，共有多少个煤球？*/
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += briquetteNum(i);
        }
        System.out.println(sum);
    }
    //求每层有多少个煤球
    public static int briquetteNum(int num) {
        if (num == 1) {
            return 1;
        }else {
            return briquetteNum(num - 1) + num;
        }
    }
}
