public class Test { 
 public static void main6(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("����������������");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int temp1 = Math.max(num1,num2);//����������������ֵ
    int temp2 = Math.min(num1,num2);//���������������Сֵ
    if (temp1 % temp2 ==0) {
        System.out.println(num1+"��"+num2+"�����Լ��Ϊ"+temp2);//˵�����Լ��������Сֵ
    }else {
        for (int i = temp2 - 1; i >0 ; i--) {
            if (temp1 % i ==0&&temp2 % i ==0) {
                System.out.println(num1+"��"+num2+"�����Լ��Ϊ"+i);
            }
        }
    }
    in.close();
    }
}