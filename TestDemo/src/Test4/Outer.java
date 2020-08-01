package Test4;

public class Outer {

     class Inner{}



    public static void foo(){
        //inner inner1 = new inner();
        Outer outer = new Outer();

    }


    public void bar(){

    }

    public static void main(String[] args) {
        //inner inner3 = new inner();
          // new Outer().Inner();
     }


    //Java 中非静态内部类对象的创建要依赖其外部类对象，上面的面试题中 foo 和 main 方法都是静态方
    //法，静态方法中没有 this，也就是说没有所谓的外部类对象，因此无法创建内部类对象，如果要在静态方法中创建内
    //部类对象，可以这样做 new Outer().new Inner();
}
