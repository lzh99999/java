class Test {    
 public static void main(String[] args) {     
    int[] arr = {1, 2, 3};         
transform(arr);     
    printArray(arr);     } 
 
    public static void printArray(int[] arr) {    
     for (int i = 0; i < arr.length; i++) {         
    System.out.println(arr[i]);       
  }   
 } 
 
    public static void transform(int[] arr) {      
   for (int i = 0; i < arr.length; i++) {       
      arr[i] = arr[i] * 2;      
   }  
   } 
}