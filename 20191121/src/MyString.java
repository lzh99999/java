import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> ret = new ArrayList<String >();
        for (int i = 0; i < n; i++) {
            if ((i+1) %3 ==0&& (i+1) %5 !=0) {
               ret.add("Fizz");
            }else if ((i+1)%3 !=0&& (i+1) %5 ==0) {
                ret.add("Buzz");
            }else if ((i+1) %3 ==0&& (i+1) %5 ==0) {
                ret.add("FizzBuzz");
            }else {
              ret.add(String.valueOf(i));
            }
        }
    }
}
