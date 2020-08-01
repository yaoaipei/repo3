package Suanfati;

import java.util.Arrays;

public class maopao2 {

    public static void main(String[] args) {

        int[]arr={1,2,4,7,9,3,2,3,};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
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
