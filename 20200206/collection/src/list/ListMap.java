package list;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述:向list中添加map元素  list存储的元素是map
 */
public class ListMap {
    public static void main(String[] args) {
        //创建list对象存储map
        List<Map<String, String>> list = new ArrayList<>();
        //创建map对象
        Map<String,String> map = new HashMap<>();
        //给map对象中添加元素
        map.put("23","aa");
        map.put("24","bb");
        map.put("25","cc");
        map.put("26","dd");
        list.add(map);
        System.out.println(list);
    }
    class Fun {
        protected void m1(int x,int y) throws IOException {}
        public int m2(){return 0;}
    }
    class som extends Fun{

        @Override
        public void m1(int x, int y) throws IOException {
            super.m1(x, y);
        }

        @Override
        public int m2() {
            return super.m2();
        }
    }
}
