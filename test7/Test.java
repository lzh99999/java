//7. ����1/1-1/2+1/3-1/4+1/5 ���� + 1/99 - 1/100 ��ֵ
    public static void main7(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            int flag = 1;
            if (i % 2 == 0) {
                flag = -flag;
            }
            sum += 1.0 / i * flag;
        }
        System.out.println("1/1-1/2+1/3-1/4+1/5 ���� + 1/99 - 1/100�ĺ�Ϊ��" + sum);
    }
//8. ��д������һ�� 1�� 100 �����������г��ֶ��ٸ�����9��
    public static void main8(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 10 ==0) {
                 count++;
            }
            int tep = i / 10;
            if (tep % 10 ==0) {
                count++;
            }
        }
        System.out.println(count);
    }
//9. ���0��999֮������С�ˮ�ɻ������������
    public static void main9(String[] args) {
        for (int i = 0; i <1000 ; i++) {
            int tep1 = i % 10;
            int tep2 = (i / 10)% 10;
            int tep3 = (i / 100)% 10;
            if (Math.pow(tep1,3)+Math.pow(tep2,3)+Math.pow(tep3,3)==i) {
                System.out.println(i);
            }
        }
    }
/*10. ��д����ģ��������������ĳ����� ����������������룬������ȷ����ʾ����¼�ɹ���,������� ����������
    �룬����������Ρ����ξ�������ʾ�˳����� */
    public static void main10(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("��������λ�������룺 ");
        String answer = "123456";
        int count = 0;
        while(count<3) {
            String password = in.nextLine();
            if (password.equals(answer)) {
                System.out.println("��¼�ɹ���");
                break;
            }else {
                System.out.println("������� �����������룬����������Σ�");
                count++;
            }
        }
         in.close();
    }
//11. дһ���������ز����������� 1 �ĸ���
    public static void numberSum(int number) {
        int count =0;
        while(number != 0)
        {
            count += number & 0x01;
            number >>= 1;
        }

        System.out.println(count);
        }
    public static void main11(String[] args) {
        numberSum(8);

    }
//12. ��ȡһ�������������������е�ż��λ������λ�� �ֱ�������������С�
    public static void main12(String[] args) {
        int number = 7;
        int x = number;
        System.out.print("����λ��");
        while (number!= 0)
        {
            int p = number % 2;
            System.out.print(p+" ");
            number = number / 4;
        }
        System.out.println();
        System.out.print("ż��λ��");
        x = x / 2;
        while (x!=0)
        {
            int p = x % 2;
            System.out.print(p + " ");
            x = x / 4;
        }

    }
 //13�� ���һ��������ÿһλ.
    public static void DigitSum(int num) {
        if(num>9){
            DigitSum( num/10);
        }
        System.out.print(num%10+" ");

    }
    public static void main13(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("���������֣� ");
        int num = in.nextInt();
        DigitSum(num);
    }