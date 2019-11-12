//³óÊı
public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index <= 0) {
        return 0;    
        }
        int[] ret = new int[index];
        ret[0] = 1;
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        for(int i =1;i< index;i++) {
            ret[i] = Math.min(ret[p2] *2,Math.min(ret[p3]*3,ret[p5]*5));
            if(ret[i] == ret[p2] *2) p2++;
            if(ret[i] == ret[p3] *3) p3++;
            if(ret[i] == ret[p5] *5) p5++;
        }
        return ret[index-1];
    }
}