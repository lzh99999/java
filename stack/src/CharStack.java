public class CharStack {
    //中缀表达式转后缀表达式
    //（2 +3）*3-5       逆波兰式
    public boolean isValid(String str) {
        char[] stack = new char[str.length()];
        int top = 0;
        //char ch = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('|| str.charAt(i) == '{'||str.charAt(i) == '[') {
                stack[top++] = str.charAt(i);
            }else {
                if (top == 0) {
                    System.out.println("右括号多！");
                    return false;
                }
                char ch = stack[top-1];
                if (ch =='(' && str.charAt(i) == ')' ||
                        ch =='[' && str.charAt(i) == ']'||
                        ch =='{' && str.charAt(i) == '}') {
                    top--;
                }else {
                    System.out.println("右括号匹配顺序不符！");
                    return false;
                }
            }
        }
        //左括号多
        if (top > 0 ) {
            System.out.println("左括号多！");
            return false;
        }
        System.out.println("左右括号匹配！");
        return true;
    }

}
