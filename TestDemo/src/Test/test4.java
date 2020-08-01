package Test;

public class test4 {

    public static void main(String[] args) {
        //通过多态的方式，创建一个Smoke类型的变量，而这个对象实际是Student
        Smoke s=new Student2();
        //直接用
        //s.somking();

        //调用静态方法用
        //用子类报错
        //method(s);
        method(s);

        Dajia dajia=new Student2();
        method3(dajia);


    }

    //参数不能用子类
    //加了staic静态局部ff就可以调用局部方法
    public static void method(Smoke smoke){
        smoke.somking();
    }

    public void method2(Dajia dajia){
//        //Smoke是接口不能被实例
//        Smoke smoke=new Smoke() 会报错

        Smoke smoke=new Student2();
          Person2 person2=new Student();
        method(smoke);
        dajia.fight();
    }

    public static void method3(Dajia dajia){

        dajia.fight();
    }




}
