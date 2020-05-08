import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String str1 = Integer.toBinaryString(ch);
                String str2 = String.format("%07d",Integer.parseInt(str1));
                int count = 0;
                for (int j = 0; j < 7; j++) {
                    if (str2.charAt(j) == '1')  count++;
                }
                System.out.println(count % 2 == 0 ? "1"+str2:"0"+str2);
            }
        }
    }
}