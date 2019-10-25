public class BirthdayCandle {
    public static void main(String[] args) {
        for (int i = 1; i < 236 ; i++) {
            int sum = 0;
            for (int j = i; j <236 ; j++) {
                if (sum < 236) {
                    sum += j;
                }else if (sum == 236 ) {
                    System.out.println("开始年龄为： "+i);
                    return;
                }else {
                    break;
                }
            }
        }
    }
}
