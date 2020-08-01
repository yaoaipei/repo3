package Test3;

public class Zi extends Fu {



    //子类继承父类重写父类的方法,方法体可以不一样

    @Override
    public void method() {
        System.out.println("我重写了父类的方法");
    }


    public static void main(String[] args) {
        Fu fu=new Fu();
        Zi zi = new Zi();
        fu.method();
        zi.method();
    }
}
