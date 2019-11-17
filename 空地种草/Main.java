import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        char[][] ch = new char[n+2][m+2] ;
        for (int i = 1; i <= n ; i++) {
            String str = in.next();
            for (int j = 1; j <= m; j++) {
               ch[i][j] = str.charAt(j-1);
            }
        }
        int k = in.nextInt();
        while (k >0) {
            for (int i = 1; i <= n ; i++) {
                for (int j = 1; j <= m; j++) {
                   if ('g'== ch[i][j]){
                       if ('g'!= ch[i-1][j] ) {
                           ch[i-1][j] = 'h';
                       }
                       if ('g'!=ch[i+1][j]){
                           ch[i+1][j] = 'h';
                       }
                       if ('g'!=ch[i][j-1]){
                           ch[i][j-1] = 'h';
                       }
                       if ('g'!=ch[i][j+1]){
                           ch[i][j+1] = 'h';
                       }
                   }
                }
            }
            for (int i = 1; i <= n ; i++) {
                for (int j = 1; j <= m; j++) {
                    if ('h' == ch[i][j]) {
                        ch[i][j] = 'g';
                    }
                }
            }
            k--;
        }
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(ch[i][j] +" ");
            }
            System.out.println();
        }
    }
}