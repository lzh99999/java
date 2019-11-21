class Solution {
    public List<String> fizzBuzz(int n) {
          List<String> ret = new ArrayList<String >();
        for (int i = 0; i < n; i++) {
            if ((i+1) %3 ==0&& (i+1) %5 !=0) {
               ret.add("Fizz");
            }else if ((i+1)%3 !=0&& (i+1) %5 ==0) {
                ret.add("Buzz");
            }else if ((i+1) %3 ==0&& (i+1) %5 ==0) {
                ret.add("FizzBuzz");
            }else {
              ret.add(String.valueOf(i+1));
            }
        }
    return ret;
    }
}