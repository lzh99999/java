public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(100)+1;
        while (true) {
            System.out.print("请输入数字1-100： ");
            int num = in.nextInt();
            if (num > answer) {
                System.out.println("猜大了！");

            }else if (num == answer) {
                System.out.println("猜对了！");
                break;
            }else {
                System.out.println("猜小了！");
            }
        }
    }