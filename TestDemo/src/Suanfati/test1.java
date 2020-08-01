package Suanfati;

public class test1 {
     //    sqrt()是用于计算数字x的平方根的函数。
    //：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            if (Math.sqrt(i+100)%1==0){
                if (Math.sqrt(i+268)%1==0){
                    System.out.println(i+"加100是一个完全平方数，再加168又是一个完全平方数");
                }
            }
        }
    }
}
