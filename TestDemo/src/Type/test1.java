package Type;

public class test1 {

    public static void main(String[] args) {

        //1.字符串如何转基本数据类型？
        //String-->int....
        String s="123";
        Integer i=1;
        int i1=1;
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i==i1);
        System.out.println(i.equals(i1));

        int s1 = Integer.parseInt(s);
        Integer integer = Integer.valueOf(i);


        //字符串转化为基本数据类型
        //Intger转化为int
        int i2 = Integer.parseInt(s);
        //String类型转化为double
        double d = Double.parseDouble(s);


        //基本数据类型转化为Sring类型
        int num=123;
        //int类型转化为包装类Intger
        Integer integer1 = Integer.valueOf(num);
        //int类型转化为String类型
        String s2 = String.valueOf(num);


        //String变量转换成字符数组Char[]：使用String类的toCharArray()方法
        String s3="123";
        char[] chars = s3.toCharArray();



        System.out.println(integer);
        System.out.println(s1);


    }
}
