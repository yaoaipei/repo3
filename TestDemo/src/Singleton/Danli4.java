package Singleton;

public class Danli4 {

    private Danli4() {
    }

    private static final Danli4 danli4=new Danli4();

    private static Danli4 getInstance(){

        return danli4;
    }
}
