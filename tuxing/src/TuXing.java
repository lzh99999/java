/*
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char ch[][] = new char[26][26];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                ch[i][j+i]= (char)('A'+j);

        for(int i=0;i<n-1;i++)
            for(int j=1;j<n;j++)
                ch[j+i][i]=(char)('A'+j);



        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(ch[i][j]);
            }
                System.out.println();
        }
    }
}
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