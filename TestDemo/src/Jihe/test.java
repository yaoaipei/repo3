package Jihe;

import java.util.*;

public class test {

    public static void main(String[] args) {

        //已知一个 HashMap<Integer，User>集合， User 有 name（String）和 age（int）属性。请写一个方法实现对
        //HashMap 的排序功能，该方法接收 HashMap<Integer，User>为形参，返回类型为 HashMap<Integer，User>，
        //要求对 HashMap 中的 User 的 age 倒序进行排序。排序时 key=value 键值对不得拆散

        HashMap<Integer,User>users=new HashMap<>();

        users.put(1,new User("老大",22));
        users.put(3,new User("老三",12));
        users.put(2,new User("老二",20));

        System.out.println(users);

    }

//编写方法排序
    public static HashMap<Integer,User> sortHashMap(HashMap<Integer,User>map){

// 首先拿到 map 的键值对集合
        Set<Map.Entry<Integer, User>> entries = map.entrySet();
 // 将 set 集合转为 List 集合，为什么，为了使用工具类的排序方法
        ArrayList<Map.Entry<Integer, User>> list = new ArrayList<>(entries);
// 使用 Collections 集合工具类对 list 进行排序，排序规则使用匿名内部类来实现
   Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
       @Override
       public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
           //按照要求根据 User 的 age 的倒序进行排

           return o2.getValue().getAge()-o1.getValue().getAge();
       }
   });
//创建一个新的有序的 HashMap 子类的集合
        LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<>();
        //将 List 中的数据存储在 LinkedHashMap 中
        for(Map.Entry<Integer, User> entry : list){
            linkedHashMap.put(entry.getKey(), entry.getValue());
           }

        return linkedHashMap;
    }




}
