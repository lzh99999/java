/*public class Count2 {
    public static void main(String[] args) {
        System.out.println(countNumberOf2s(10));
    }
//
    public static int countNumberOf2s(int n) {
        int count = 0;
        int low = 0;
        int cur = 0;
        int high = 0;
        int flag = 1;
        while (n / flag != 0) {
            low = n - (n / flag) * flag;//计算出低位
            cur = (n / flag) % 10;
            high = n / (flag * 10);

            if (cur == 0 || cur == 1) {
                count += high * flag;
            } else if (cur == 2) {
                count += high * flag + low + 1;
            } else {
                count += (high + 1) * flag;
            }
            flag *= 10;
        }
        return count;
    }
}*/

import java.util.Arrays;
import java.util.Stack;

public class Main {
    //堆排序
    private static void heapSort(int[] array) {
        int size = array.length - 1;
        for (int root = (array.length - 1 - 1) / 2; root >= 0; root--) {
            down(array, root, array.length);
        }
        while (size > 0) {
            swap(array, 0, size);
            down(array, 0, size);
            size--;
        }
    }

    private static void down(int[] array, int root, int size) {
        int child = 2 * root + 1;
        while (child < size) {
            if (child + 1 < size && array[child + 1] > array[child]) {
                child++;
            }
            if (array[root] > array[child]) {
                break;
            } else {
                swap(array, root, child);
                root = child;
                child = 2 * root + 1;
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    //快排
    private static void quick(int[] array) {
        Stack<Integer> stack = new Stack<>();
        stack.push(array.length);
        stack.push(0);
        while (!stack.empty()) {
            int left = stack.pop();
            int right = stack.pop();
            if (left < right) {
                int key = fun(array, left, right);
                //[left,key) [key+1,right)
                stack.push(right);
                stack.push(key + 1);
                stack.push(key);
                stack.push(left);
            }
        }
    }

    private static int fun(int[] array, int left, int right) {
        int pre = left;
        int cur = left + 1;
        while (cur < right) {
            if (array[cur] < array[left] && ++pre != cur) {
                swap(array, pre, cur);
            }
            cur++;
        }
        if (++pre != array.length) {
            swap(array, pre, left);
        }
        return array[left];
    }

    private static void merge(int[] array) {
        int gop = 1;
        int[] tmp = new int[array.length];
        while (gop < array.length) {
            for (int left = 0; left < array.length; left += gop * 2) {
                int mid = left + gop;
                int right = mid + gop;
                if (mid > array.length) mid = array.length;
                if (right > array.length) right = array.length;
                mergeDate(array, left, mid, right, tmp);
            }
            System.arraycopy(tmp, 0, array, 0, array.length);
            gop <<= 1;
        }
    }

    private static void mergeDate(int[] array, int left, int mid, int right, int[] tmp) {
        int index = left;
        int begin = left,begin1 = mid;
        while (begin < mid && begin1 < right) {
            if (array[begin] < array[begin1]) {
                 tmp[index++] = array[begin++];
            }else {
                tmp[index++] = array[begin1++];
            }
        }
        while (begin < mid) {
            tmp[index++] = array[begin++];
        }
        while (begin1 < right) {
            tmp[index++] = array[begin1++];
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 0, 2, 1, 5, 4, 3, 7, 8, 6};
//        heapSort(array);
//        quick(array);
        merge(array);
        System.out.println(Arrays.toString(array));
    }
}
/*    private static void merge(int[] array) {
        if (array != null) {
            int[] tmp = new int[array.length];
            merge(array, 0, array.length, tmp);
        }
    }

    private static void merge(int[] array, int i, int length, int[] tmp) {
        if (i + 1 < length) {
            int mid = i + ((length - i) >> 1);
            merge(array, i, mid, tmp);
            merge(array, mid, length, tmp);
            mergeDate(array, i, mid, length, tmp);
            System.arraycopy(tmp, i, array, i, length - i);
        }
    }

    private static void mergeDate(int[] array, int i, int mid, int length, int[] tmp) {
        int index = i;
        int left = i, right = mid;
        while (left < mid && right < length) {
            if (array[left] < array[right]) {
                tmp[index++] = array[left++];
            } else {
                tmp[index++] = array[right++];
            }
        }
        while (left < mid) {
            tmp[index++] = array[left++];
        }
        while (right < length) {
            tmp[index++] = array[right++];
        }
    }

    private static void mergeNor(int[] array) {
        int[] tmp = new int[array.length];
        int gop = 1;
        while (gop < array.length) {
            for (int left = 0; left < array.length; left += gop * 2) {
                int mid = left + gop;
                int right = mid + gop;
                if (mid > array.length) mid = array.length;
                if (right > array.length) right = array.length;
                mergeDate(array, left, mid, right, tmp);
            }
            System.arraycopy(tmp, 0, array, 0, array.length);
            gop <<= 1;
        }
    }

    private static void quickSort(int[] array) {
        Stack<Integer> stack = new Stack<>();
        stack.push(array.length);
        stack.push(0);
        while (!stack.empty()) {
            int left = stack.pop();
            int right = stack.pop();
            if (left < right) {
                int key = fun1(array, left, right);
                //[left,key)
                //[key+1,right)
                stack.push(right);
                stack.push(key + 1);
                stack.push(key);
                stack.push(left);
            }
        }
    }

    private static int fun1(int[] arr, int left, int right) {
        int begin = left;
        int end = right - 1;
        int jizhun = arr[left];
        while (begin < end) {
            while (begin < end && jizhun < arr[end]) {
                end--;
            }
            if (begin < end)
                arr[begin] = arr[end];
            while (begin < end && jizhun > arr[begin]) {
                begin++;
            }
            if (begin < end)
                arr[end] = arr[begin];
            end--;
        }
        arr[begin] = jizhun;
        return arr[begin];
    }

    private static int fun(int[] array, int left, int right) {
        int pre = left;
        int cur = left + 1;
        while (cur < right) {
            if (array[cur] < array[left] && ++pre != cur) {
                swap(array, pre, cur);
            }
            cur++;
        }
        if (++pre != array.length) {
            swap(array, pre, left);
        }
        return array[left];
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static void heapSort(int[] array) {
        int size = array.length-1;
        for (int root = (array.length-1-1)/2; root >=0 ; root--) {
            shutdown(array,root,array.length);
        }
        while (size >0) {
            swap(array,0,size);
            shutdown(array,0,size);
            size--;
        }
    }

    private static void shutdown(int[] array, int root, int size) {
        int child = root * 2 + 1;
        while (child < size) {
            if (child + 1 < size && array[child] < array[child + 1]) {
                child++;
            }
            if (array[root] < array[child]) {
                swap(array, root, child);
                root = child;
                child = 2 * root + 1;
            }else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 6, 8, 1, 3, 5, 4, 9, 0};
        //mergeNor(array);
//        quickSort(array);
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}*/

/*import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int caozuo = sc.nextInt();
                int shu = sc.nextInt();
                if (caozuo == 1) {
                    list.add(shu);
                }else {
                    int index = list.indexOf(shu);
                    list.remove(index);
                }
                if (list.size() < 3) {
                    System.out.println("No");
                }else {
                    list.sort(((o1, o2) -> o2-o1));
                    int max = list.get(0);
                    int sum = 0;
                    for (int j = 1; j < list.size(); j++) {
                        sum+=list.get(j);
                    }
                    if (sum > max) {
                        System.out.println("Yes");
                    }else {
                        System.out.println("No");
                    }
                }
            }
        }
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //十六进制的字符串
            String str = sc.next();
            str = str.substring(2);
            int i = Integer.parseInt(str,16);
            System.out.println(i);
        }
    }
}*/
/*import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            TreeMap<Character,Integer> map = new TreeMap<>();
            String str = sc.nextLine();
            int x = 26;
            for (int i = 0; i < x; i++) {
                map.put((char) ('A'+i),0);
            }
            for (int i = 0; i < str.length(); i++) {
                char tmp = str.charAt(i);
                if(map.containsKey(tmp)) {
                    map.put(tmp, map.get(tmp) + 1);
                }
            }
            for (Map.Entry<Character, Integer> tmp : map.entrySet()) {
                System.out.println(tmp.getKey()+":"+tmp.getValue());
            }
        }
    }
}*/
/*
import java.util.Scanner;

public class Main {
    public static int[] w = new int[]{17 * 29, 29, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] yuan = sc.next().split("\\.");
        String[] shi = sc.next().split("\\.");
        int[] p = {Integer.parseInt(yuan[0]), Integer.parseInt(yuan[1]), Integer.parseInt(yuan[2])};
        int[] a = {Integer.parseInt(shi[0]), Integer.parseInt(shi[1]), Integer.parseInt(shi[2])};
        int ta = a[0] * w[0] + a[1] * w[1] + a[2] * w[2];
        int tp = p[0] * w[0] + p[1] * w[1] + p[2] * w[2];
        int zhao = ta - tp;
        if (zhao < 0) {
            System.out.print("-");
            zhao = -zhao;
        }
        System.out.println(zhao / w[0] + "." + zhao % w[0] / w[1] + "." + zhao % w[0] % w[1] / w[2]);
    }
}
*/

/*
import java.util.Scanner;
public class Main {
    private static final int[] W = {17*29,29,1};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] p = in.next().split("\\.");
        String[] a = in.next().split("\\.");
        int[] P = {Integer.parseInt(p[0]),Integer.parseInt(p[1]),Integer.parseInt(p[2])};
        int[] A = {Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2])};
        int ta = A[0]*W[0]+A[1]*W[1]+A[2]*W[2];
        int tp = P[0]*W[0]+P[1]*W[1]+P[2]*W[2];
        int t = ta-tp;
        if(ta<tp){
            System.out.print("-");
            t = -t;
        }
        System.out.println(t/W[0]+"."+t%W[0]/W[1]+"."+t%W[0]%W[1]/W[2]);
    }
}*/
/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            str = str.trim();
            String[] strs = str.split(" ");
            for(int i = strs.length-1;i>=0;i++) {
                if(i == 0) {
                    System.out.println(strs[i]);
                }else {
                    System.out.print(strs[i]+" ");
                }
            }
        }
    }
}*/
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String str1 = Integer.toBinaryString(ch);
                String str2 = String.format("%07d",Integer.parseInt(str1));
                int count = 0;
                for (int j = 0; j < 7; j++) {
                    if (str2.charAt(j) == '1')  count++;
                }
                System.out.println(count % 2 == 0 ? "1"+str2:"0"+str2);
            }
        }
    }
}*/
/*
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.charAt(0)-'0';
        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len1 = o1.length();
                int len2 = o2.length();
                if (len1>len2) {
                    return 1;
                } else if (len1 <len2) {
                    return -1;
                } else {
                    for (int i = o1.length() - 1; i >= 0; i--) {
                        char tmp1 = o1.charAt(i);
                        char tmp2 = o2.charAt(i);
                        if (tmp1 > tmp2) {
                            return 1;
                        } else if (tmp2 > tmp1) {
                            return -1;
                        }
                    }
                    return 0;
                }
            }
        });

        for (int i = 0; i < n; i++) {
            String tmp = sc.nextLine();
            set.add(tmp);
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
*/

/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringBuilder str = new StringBuilder();
            String STR = new String();
            STR = scan.next();
            str.append(STR);
            list.add(str);
        }
       StringBuilder str = new StringBuilder();
        for (int i = 0; i < N; i++) {
            str = list.get(i);
            int j = 0;
            List<Character> slist = new LinkedList<>();
            while (j < str.length()) {
                char a = str.charAt(j);
                if (slist.isEmpty()) {
                    slist.add(0, a);
                    j++;
                } else if (slist.size() == 1 && slist.get(0) == a) {
                    slist.add(1, a);
                    j++;
                } else if (slist.size() == 2 && slist.get(1) == a) {
                    str.deleteCharAt(j);
                } else if (slist.size() == 2 && slist.get(1) != a) {
                    slist.add(a);
                    j++;
                } else if (slist.size() == 3 && slist.get(2) == a) {
                    str.deleteCharAt(j);
                } else if (slist.size() == 3 && slist.get(2) != a) {
                    slist.clear();
                    slist.add(a);
                    j++;
                } else {
                    slist.clear();
                    slist.add(a);
                    j++;
                }
            }
            System.out.println(str);
        }
    }
}*/
/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int count = 0;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            sb = new StringBuilder();
            count = 0;
            int n = sc.nextInt();
            boolean[] flag = new boolean[n];
            int sum = sc.nextInt();
            int[] array = new int[n];
            for(int i = 0;i < n;i++) {
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            fun(array,sum, flag);
            System.out.println(count);
        }
    }
    private static void fun(int[] array,int sum,boolean[] flag) {
        if(sum < 0) {
            return;
        }
        if(sum ==0){
                count++;
            return;
        }
        for(int i = 0;i < array.length; i++) {
            if(!flag[i]) {
                flag[i] = true;
                sum -=array[i];
                if (sb.toString().contains(""+i)){
                    continue;
                }
                sb.append(i);
                fun(array,sum,flag);
                sum += array[i];
                flag[i] = false;
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}*/
