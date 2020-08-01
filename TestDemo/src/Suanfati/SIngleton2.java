package Suanfati;

public class SIngleton2 {

    private static SIngleton2 instance=null;

    public static synchronized SIngleton2 getInstance(){
        if (instance==null){
            instance=new SIngleton2();
        }
        return instance;
    }
}
