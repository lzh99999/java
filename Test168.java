import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            str = str.trim();
            String[] strs = str.split(" ");
            for(int i = strs.length-1;i>=0;i++) {
                if(i == 0) {
                    System.out.println(strs[i]);
                }else {
                    System.out.print(strs[i]+" ");
                }
            }
        }
    }
}