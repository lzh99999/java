/*

利用字母可以组成一些美丽的图形，下面给出了一个例子：

ABCDEFG

BABCDEF

CBABCDE

DCBABCD

EDCBABC

这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
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
for(j = i;j  < m;j++)        //此处两个循环用来控制存储字符的
{
    pattern[i][j] = str++;
}
str = 'A';
for(j = i - 1;j >= 0;j --)
{
pattern[i][j] = ++str;
}
}

for(i = 0;i < n;i ++)    //此处用来输出字符数组元素
{
for(j = 0;j < m;j ++)
{ System.out.print(pattern[i][j]);
}
System.out.println();
}
}
}
