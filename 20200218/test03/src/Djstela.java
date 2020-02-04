import java.util.Arrays;

/**
 * 描述:迪杰斯特拉算法
 */
public class Djstela {
    static int[] ret = new int[9];//第一个数到其他任意点的最小路径
    static int size = ret.length;//顶点的个数
    static int[][] tu = new int[][]{
            {0,1,5,1000,1000,1000,1000,1000,1000},
            {1,0,3,7,5,1000,1000,1000,1000},
            {5,3,0,1000,1,7,1000,1000,1000},
            {1000,7,1000,0,2,1000,3,1000,1000},
            {1000,5,1,2,0,3,6,9,1000},
            {1000,1000,7,1000,3,0,1000,5,1000},
            {1000,1000,1000,3,6,1000,0,2,7},
            {1000,1000,1000,1000,9,5,2,0,4},
            {1000,1000,1000,1000,1000,1000,7,4,0}
    };//给的图 用邻接矩阵表示

    public static void main(String[] args) {

        int min = 0;//用来存储ret中的最小值  用来加其他的顶点路径进行比较
        boolean[] booleans = new boolean[size];//判断顶点是否已经判断
        //获得图的第一排为最短路径   v0 到其他顶点的最短路径
        for (int i = 0; i < size; i++) {
            ret[i] = tu[0][i];
        }
        booleans[0] = true;
        for (int i = 1; i < size; i++) {//比较的次数
            min = 65535;
            int k =0;
            //找出ret中的最小值
            for (int m = 0; m < size; m++) {
                if (!booleans[m] &&ret[m] < min) {
                    min = ret[m];
                    k = m;//记录最小值为哪一列
                }
            }
            booleans[k] = true;//确定v0到k的最短路径已经确定
            //拓展从k 到其他节点的路径 v0-k  加上 k-其他节点的  与ret存储的最小路径进行比较
            //如果加之后的和小于 ret存储的 然后进行更新
            for (int j = 0; j < size; j++) {
                if (!booleans[j]&&(min+tu[k][j])<ret[j]) {
                    ret[j] = min+tu[k][j];
                }
            }
        }
        System.out.println(Arrays.toString(ret));
    }
}
