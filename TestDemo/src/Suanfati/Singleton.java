package Suanfati;

public class Singleton {

    private Singleton() {
    }
    //在自己内部定义自己一个实例，是不是很奇怪？
    //注意这是private 只供内部调用
    private static Singleton instance=new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

}
