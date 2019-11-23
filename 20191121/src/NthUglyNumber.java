import java.util.Arrays;

class UglyNumber_Solution {
    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(100,2,11,13));
    }
    public static int GetUglyNumber_Solution(int index,int a,int b,int c) {
        if(index <= 0) {
            return 0;
        }
        int[] ret = new int[index+1];
        int pa = 1;
        int pb = 1;
        int pc = 1;
        for(int i =0;i<= index;i++) {
            ret[i] = Math.min(pa *a,Math.min(pb*b,pc*c));
            if(ret[i] == pa *a) pa++;
            if(ret[i] == pb *b) pb++;
            if(ret[i] == pc *c) pc++;
        }
        System.out.println(Arrays.toString(ret));
        return ret[index-1];
    }
}