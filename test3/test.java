#include<stdio.h>
#include<stdlib.h>
        int count9(int n)
        {
            int count = 0;
            for (int i = 1; i <= n; ++i)//��n������������
            {
                if (i % 10 == 9)//��ÿ�����������Ƿ�Ϊ9,���ҿ�������ٸ�9
                {
                    count++;//�������9�Ĵ���
                }
            }
            return count;//����9�ĳ��ִ�����count9����
        }
        int main()
        {
            printf("%d\n", count9(100));
            system("pause");
            return 0;
        }
