/**
 * 描述:普里姆算法
 */
public class Main {
    static int[][] juzhen = new int[][]{
            {0,10,1000,11},
            {10,0,20,19},
            {1000,20,0,5},
            {11,19,5,0}
    };
    static int size = 4;
    static int[] value = new int[size];//顶点的值
    static int MAXVALUE = 1000;

    public static void main(String[] args) {
      int[] arr = new int[] {0,2,3,1,1};

    }

    //普里姆算法
    public static void prim() {
        int[] low = new int[size];
        int min, minId, sum = 0;
        //先得到邻接矩阵的第一行数据作为最短路径
        for (int i = 0; i < size; i++) {
            low[i] = juzhen[0][i];
        }
        for (int i = 1; i < size; i++) {//low和其他行数比较的次数  从1开始是因为 第一行不用和第一行比较
            min = MAXVALUE;//最小元素
            minId = 0;//最小元素下标
            //找出low数组中的最小的元素
            for (int j = 0; j < size; j++) {
                if (low[j] != 0 && low[j] < min) {
                    min = low[j];
                    minId = j;
                }
            }
            System.out.println(value[minId] + "------" + min);
            sum+=min;//累加权值
            low[minId] = 0;
            for (int j = 0; j < size; j++) {
                if (low[j] !=0 && juzhen[minId][j] < low[j]) {
                    low[j] = juzhen[minId][j];
                    value[j]= minId;
                }
            }
        }
        System.out.println(sum);
    }
}
