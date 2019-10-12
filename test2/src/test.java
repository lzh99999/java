public class test {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <=100 ; i++) {
            int flag = 1;
            if(i % 2 == 0) {
                flag = - flag;
            }
            sum += 1.0 / i * flag;
        }
        System.out.println("1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100的和为："+sum);
    }
}
