package Suanfati;

import java.util.Scanner;

public class test13 {
   // 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a;
        do {
            System.out.println("请输入一个五位正整数");
            a = scanner.nextInt();
        }while (a<10000||a>99999);
            String s = String.valueOf(a);
            char[] chars = s.toCharArray();
            if (chars[0]==chars[4]&&chars[1]==chars[3]){
                System.out.println("这是一个回文数");
            }else {
                System.out.println("这不是一个回文数");

        }
    }


}
