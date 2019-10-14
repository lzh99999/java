#include<stdio.h>
#include<stdlib.h>
        int count9(int n)
        {
            int count = 0;
            for (int i = 1; i <= n; ++i)//将n个数依次输入
            {
                if (i % 10 == 9)//看每个数的余数是否为9,并且可以余多少个9
                {
                    count++;//计算出现9的次数
                }
            }
            return count;//返回9的出现次数给count9函数
        }
        int main()
        {
            printf("%d\n", count9(100));
            system("pause");
            return 0;
        }
