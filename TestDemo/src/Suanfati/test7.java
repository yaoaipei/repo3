package Suanfati;

public class test7 {
    //打印出如下图案（菱形）
    //高和宽必须是相等的奇数

    public static void main(String[] args) {
        int h=7,w=7;
        for (int i = 0; i < (h+1)/2; i++) {
            for (int j = 0; j < w / 2 - i; j++) {
                System.out.println();
            }
            for (int k = 0; k < (i + 1) * 2; k++) {
                System.out.println("*");
            }
            System.out.println();
        }
        for (int i = 0; i < h/2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("");
            }
            for (int k=1;k<=w-2*i;k++){
                System.out.println('*');
            }
            System.out.println();
        }

    }
}
