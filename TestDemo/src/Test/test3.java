package Test;

public class test3 {

    public static void main(String[] args) {

        //通过多态的方式，创建一个Person类型的变量，而这个对象实际是Student
         Person2 person2=new Student();

         Person person=new Person();
         method(person2);


        //调用method方法，获取返回的Person对象
        Person2 person21 = method2();
        person21.show();

    }


    public static void method(Person2 p2){
        p2.show();
    }



    public static Person2 method2(){
        Person2 p2=new Student();
        return p2;
    }
}
