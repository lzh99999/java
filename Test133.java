import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            for(int i = 0; i<str.length();i++) {
                char ch = str.charAt(i);
                if(ch==' ') {
                    System.out.print(" ");
                }else {
                    int j = (ch - 'A'+21) % 26;                                                                         
                    char tmp = (char) (j+65);
                    System.out.print(tmp);
                }
            }
            System.out.println();
        }
    }
}