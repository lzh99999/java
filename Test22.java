//两个字符串二进制相加
  public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int jin = 0;
      for (int i = a.length()-1,j = b.length()-1;i>=0||j >=0; i--,j--) {
              int sum  = jin;
              sum += i>=0 ? a.charAt(i)-'0':0;
              sum += j>=0 ? b.charAt(j)-'0':0;
              sb.append(sum%2);
              jin = sum/2;
      }
      if (jin ==1) {
          sb.append(1);
      }
      return sb.reverse().toString();
  }