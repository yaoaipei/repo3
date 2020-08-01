package Suanfati;

public class danli {
    private danli(){

    }

   private static danli instance=new danli();

    public static danli getInstance(){
        return instance;
    }

}
