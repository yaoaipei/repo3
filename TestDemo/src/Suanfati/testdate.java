package Suanfati;

import java.util.Scanner;

public class testdate {
//    输入某年某月某日，判断这一天是这一年的第几天？
    public static void main(String[] args) {
        int year,month,day;
        int days=0;
        int d=0;
        int e;
        Scanner scanner=new Scanner(System.in);



        do {
            e=0;
            System.out.println("输入年:  ");
          year=scanner.nextInt();
            System.out.print("输入月：");
            month=scanner.nextInt();
            System.out.println("输入天:  ");
            day=scanner.nextInt();
            if (year<0||month<0||month>12||day<0||day>31){
                System.out.println("输入错入");
            }
        }while (e==1);
        for (int i = 1; i <month ; i++) {
            switch (i){
                case 1:
                case 3:
                case 7:
                case 8:
                case 10:
                case 12:
                    days=31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days=30;
                    break;
                case 2:
                    if ((year%400==0)||(year%4==0&&year%100!=0)){
                        days=29;
                    }else {
                        days=28;
                    }
                    break;
            }
            d+=days;
        }
        System.out.println(year+"-"+month+"-"+day);
    }
}
