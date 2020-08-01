package StringTest;

public class test {

    public static void main(String[] args) {
//简单的说，如果整型字面量的值在-128 到 127 之间，那么不会 new 新的 Integer 对象，而是直接引用常量池
//中的 Integer 对象，
        Integer i1=100,i2=100,i3=150,i4=150;
        System.out.println(i1==i2);
        System.out.println(i3==i4);

    }
}
