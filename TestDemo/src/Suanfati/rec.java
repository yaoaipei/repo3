package Suanfati;

public class rec {

    public long rec(int n){
        long value = 0 ;
        if(n ==1 ) {
            value = 1;
        } else   {
            value = n * rec(n-1);
        }
        return value;
    }
}
