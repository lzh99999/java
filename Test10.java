 //比较含退格的字符串
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> s = new Stack<>();
        Stack<Character> t = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) =='#') {
                if (s.isEmpty()) {
                    continue;
                }
                s.pop();
            }else {
                s.push(S.charAt(i));
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) =='#') {
                if (t.isEmpty()) {
                    continue;
                }
                t.pop();
            }else {
                t.push(T.charAt(i));
            }
        }
        int a = s.size() - t.size();
        if (a != 0) {
            return false;
        }
        a = s.size();
        while ( a>0) {
            char sc = s.pop();
            char tc = t.pop();
            if (sc != tc) {
                return false;
            }
            a--;
        }
        return true;
    }