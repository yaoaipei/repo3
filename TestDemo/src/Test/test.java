package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
       //for循环遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("//////////////////");
        for (String l :list) {
            System.out.println(l);
        }

        System.out.println("///////////////////");
         //定义Hashmap
        HashMap<String,String> map=new HashMap();
        map.put("a","a1");
        map.put("b","b2");
        //遍历
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);

        }
    }
}
