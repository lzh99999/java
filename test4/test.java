public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(100)+1;
        while (true) {
            System.out.print("����������1-100�� ");
            int num = in.nextInt();
            if (num > answer) {
                System.out.println("�´��ˣ�");

            }else if (num == answer) {
                System.out.println("�¶��ˣ�");
                break;
            }else {
                System.out.println("��С�ˣ�");
            }
        }
    }