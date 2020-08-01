package Singleton;

public class Danli {

    //私有化构造函数
    private Danli() {
    }

    //直接实例化1对象
    private static Danli danli=new Danli();

    //返回对象实例
    public static Danli getInstance(){

        return danli;
    }
}
