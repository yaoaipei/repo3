package Singleton;

public class Danli3 {
    private Danli3(){

    }

    private static Danli3 danli3=new Danli3();


    public static Danli3 getInstance(){
        return danli3;
    }

}
