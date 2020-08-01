package Test;

public class testFinal {
//使用final关键字修饰一个变量时，是指引用变量不能变，引用变量所指向的

    public static void main(String[] args) {

        final StringBuffer s=new StringBuffer("hello");
//        s=new StringBuffer("");
        StringBuffer s1 = s.append("world");
        System.out.println(s1);

    }


}
