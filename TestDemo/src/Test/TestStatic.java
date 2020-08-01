package Test;

public class TestStatic {


    public static int s=0;
    public int s1=0;





    public TestStatic(){
       s++;
       s1++;
        System.out.println(s);
        System.out.println(s1);
    }

    public TestStatic(String s){

    }

    //全局变量被static修饰局部类可用
    public static void main(String[] args) {
        System.out.println(s);

    }



}
