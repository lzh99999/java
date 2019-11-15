import java.util.*;

public class GoUpstairs {
    public int countWays(int n) {
        int  a = 1;
        int b = 2;
        int c = 0;
        if(n < 2) {
            return 0;
        }
        if(n == 2) {
            return 1;
        }
        if(n == 3) {
            return 2;
        }
      for(int i =4;i<=n;i++) {
          c = (a+b)%1000000007;
          a = b%1000000007;
          b = c%1000000007;
      }
        return b %1000000007;
}
}