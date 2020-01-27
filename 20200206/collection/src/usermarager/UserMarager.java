package usermarager;

import java.util.HashMap;

/**
 * 描述:
 */
public class UserMarager {
    private HashMap<String, String> hashMap = new HashMap<>();

    public UserMarager() {
        hashMap.put("aa","11");
        hashMap.put("bb","22");
    }
    //添加用户
    public void add(String name,String passWord) {
        hashMap.put(name,passWord);
    }
    //判断是否包含name
    public boolean contains(String name) {
        return hashMap.containsKey(name);
    }
    //判断用户名和密码是否合法
    public boolean isSuccess(String name,String passWord) {
        String psw = hashMap.get(name);
        if (psw == null) {
            return false;
        }
        return psw.equals(passWord);
    }
}
