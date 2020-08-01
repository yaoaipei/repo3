package Suanfati;

public class test4 {
    public static void main(String[] args) {
        //输出9*9口诀。
        for (int i = 1; i <10 ; i++) {
            for (int j=1;j<=i;j++){
                System.out.println(j+"*"+i+"="+j*i+" ");
                if (j*i<10){ System.out.println(""); }
            }
            System.out.println();
        }

    }
}
