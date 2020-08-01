package Test3;

public class TestSmoke {

    public static void main(String[] args) {
        //利用多态 接口对象引用实现的类的对象,调用实现类的方法
        Smoke smoke=new Student();
        //普通创建Student的实例对象调用方法
        Student student=new Student();
        smoke.smokeing();
        student.smokeing();

    }
}
