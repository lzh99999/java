public class Solution {
    public void reOrderArray(int [] array) {
        if(array.length <= 1 || array == null) {
            return;
        }
        int i = 0;
        int tmp = 0;
           while(i < array.length) {
               if(array[i]%2 == 1) {
                  i++;
               }else{
                  int j = i + 1;
                   while(array[j] % 2 == 0) {
                       if(j == array.length-1) {
                           return;
                       }else {
                           j++;
                       }
                   }
                   tmp = array[j];
                   while(j > i) {
                   array[j] = array[j-1];
                   j--;
               }
               array[i] = tmp;
               }
           }
    }
}