public class Solution {

public String ReverseSentence(String str) {
if (str == null || str.length() == 0) {
return str;
}
//���ǿո���������û�б�Ҫ��ת��
String[] temp = str.split(" ");
if (temp.length == 0) {
return str;
}
String p = "";
for (int i = temp.length - 1; i >= 0; i--) {
if (i == 0) {
p = p + temp[i];
} else {
p = p + temp[i] + " ";
}
}
return p;
}
