package Suanfati;

public class test14short {

    //基本数据类型在运算时的，由低到高会自动转换，而由高到低时会强制转换
    public static void main(String[] args) {

        short s1=1;
        //s1=s1+1会报错
        //因为short类型加一个int类型所以会自动提升类型编程一个int类型
        //所以报错
        int i = s1 + 1;

        //+=是java规定的运算符,java编译器会对他进行特殊处理,所以编译成功
        short i1 = s1 += 1;
        System.out.println(i1);

    }
}
