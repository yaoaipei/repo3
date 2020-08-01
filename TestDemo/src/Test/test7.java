package Test;

public class test7 {
    public static void main(String[] args) {

        String s="abc";

        int a=0;

        switch (s){
            case "a":a=1;
            break;
            case "ab":a=2;
            break;
            case "abc":a=3;
            break;
        }
        System.out.println(a);
    }
}
