package Type;

public class test2 {


    public static void main(String[] args) {
        //赋值调用
        int sum = sum(1, 2); //实参常量
        System.out.println(sum);

        int a=1;
        int b=2;
        System.out.println(sum(a,b));  //实参变量
    }


    public static int sum(int a,int b){

        return a+b;
    }
}
