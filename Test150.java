public class Main {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 1000 ) {
            n = 1000;
        }
        int count = 0;
        int[] arr = new int[n];
        for(int i = 0;i < n;i++) {
            arr[i] = i;
        }
        int j = 1;

        for(int i = 1;i < n;i++) {
            if(j == 2&& arr[i] != -1) {
                arr[i] = -1;
                count++;
                j = 0;
                if(count == n-1) {
                    break;
                }
            }else if(arr[i] != -1){
                j++;
            }
            if(i == n-1) {
                i = -1;
            }
        }
        int ret = 0;
        for(int p = 0;p < n;p++) {
            if(arr[p] != -1) {
                ret = arr[p];
                break;
            }
        }
        System.out.println(ret);
    }
}