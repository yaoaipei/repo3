package Test;

public class test5<str> extends Object {
    int age;

    @Override
    public String toString() {
        return "\"Person [age=\" + age + \"]";

    }


    //带参构造方法
    public test5(int age) {
        this.age = age;
    }

    static String str="abcde";

}
