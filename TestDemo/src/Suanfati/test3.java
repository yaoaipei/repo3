package Suanfati;

import java.util.Scanner;

public class test3 {
    //题目：输入三个整数x,y,z，请把这三个数由小到大输出。

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=0;
        int y=0;
        int z=0;
        System.out.println("输入第一个数字:  ");
         x = scanner.nextInt();
        System.out.println("输入第二个数字:  ");
        y= scanner.nextInt();
        System.out.println("输入第三个数字:  ");
        z = scanner.nextInt();
        if (x>y){
            int temp=x;
            x=y;
            y=temp;
        }
        if (x>z){
            int temp=x;
            x=z;
            z=temp;
        }
        if (y>z){
            int temp=y;
            y=z;
            z=temp;
        }

        System.out.println("三个数字由小到大排列为： "+x+y+z);
    }
}
