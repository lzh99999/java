/*

������ĸ�������һЩ������ͼ�Σ����������һ�����ӣ�

ABCDEFG

BABCDEF

CBABCDE

DCBABCD

EDCBABC

����һ��5��7�е�ͼ�Σ����ҳ����ͼ�εĹ��ɣ������һ��n��m�е�ͼ�Ρ�
*/
import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
char str;
char[][] pattern=new char[26][26];
int i,j;
for(i = 0;i < n;i++)
{
str = 'A';
for(j = i;j  < m;j++)        //�˴�����ѭ���������ƴ洢�ַ���
{
    pattern[i][j] = str++;
}
str = 'A';
for(j = i - 1;j >= 0;j --)
{
pattern[i][j] = ++str;
}
}

for(i = 0;i < n;i ++)    //�˴���������ַ�����Ԫ��
{
for(j = 0;j < m;j ++)
{ System.out.print(pattern[i][j]);
}
System.out.println();
}
}
}
