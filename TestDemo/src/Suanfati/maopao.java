package Suanfati;

import java.util.Arrays;

public class maopao {


    public static void main(String[] args) {
    int[]arr={4,6,8,9,1,2,7,3};
    int[]a=new int[1];
    int[]aa=new int[]{1,2,1,2,2,1,1};

//控制多少轮
        for (int i = 0; i < arr.length; i++) {
            //控制每一轮的次数
            for (int j = 0; j < arr.length-1-i; j++) {
            if (arr[j]>arr[j+1]){
                int temp;
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
        }
        String s = Arrays.toString(arr);
        System.out.println(s);
    }

}

