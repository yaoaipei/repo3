package Suanfati;

public class danli2 {
    private static danli2 instance=null;

    public static danli2 getInstance(){
        if (instance==null){
            instance=new danli2();
        }
        return instance;
    }
}
