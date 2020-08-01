package Test;

public class test6 {

    public static void main(String[] args) {
        String str ="abcde";
        String str2="Stringdemo.java";
        //字符串中有多少个字符
        int i = str.length();
        System.out.println(i);
        //获取部分字符串
        String s = str.substring(1);
        System.out.println(s);
        String s1 = str.substring(0, 4);
        System.out.println(s1);
        String s2 = str.substring(1, 4);
        System.out.println(s2);
        String s3 = str.substring(0, 5);
        System.out.println(s3);
        String s4 = str.substring(4, 5);
        System.out.println(s4);

        //字符串是否以指定字符串开头。结尾同理

        boolean startsWith = str2.startsWith("String");
        System.out.println(startsWith);
        boolean startsWith2 = str2.startsWith("S");
        System.out.println(startsWith2);
        boolean endsWith = str2.endsWith("java");
        System.out.println(endsWith);

       // 字符串中是否包含另一个字符串
        //判断是否包含指定字符串，包含则返回第一次出现该字符串的索引，不包含则返回-1
        int i1 = str.indexOf("bcd");
        System.out.println(i1);
        //判断是否包含指定字符串，包含返回true，不包含返回false
        boolean b = str.contains("bcd");
        System.out.println(b);

     //将字符串转成一个字符数组。或者字节数组
        char[] chars = str.toCharArray();
        System.out.println(chars);
        //一个一个的遍历
        for (int j = 0; j < chars.length; j++) {
            char aChar = chars[j];
            System.out.println(aChar);
        }

        byte[] bytes = str.getBytes();
        System.out.println(bytes);

//判断两个字符串中的内容是否相同
        String str3="abcde";
        boolean b1 = str.equals(s3);
        System.out.println(b1);


       // 获取该字符串对象中的内容
        String str4=new String("我是什么");
        System.out.println(str4.toString());
        System.out.println(str4);



        //StringBuffer的方法使用

        StringBuffer sb=new StringBuffer();
        //打印时为空有内容
        System.out.println(sb);
        StringBuffer ssb = sb.append("我自己添加的内容");
        System.out.println(ssb);
        StringBuffer insert = sb.insert(0, "指定位置插入");
        System.out.println(insert);
        StringBuffer delete = sb.delete(0, 6);
        System.out.println(delete);
        StringBuffer replace = sb.replace(0, 1, "它");
        System.out.println(replace);



    }


}
