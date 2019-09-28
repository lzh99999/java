import java.util.Scanner;

//乘法口诀表
public class MulTable {
    public static void main(String[] args) {
      Scanner  in = new Scanner(System.in);
      int n = in.nextInt();
        for (int i = 0; i <=n ; i++){
            for (int j = 0; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
    }


