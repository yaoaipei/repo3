package Test;

public class Testforperson {

    public static void main(String[] args) {
        Person person = new Person();


        method(person);




    }



    //加了static就可以给局部类调用例如main方法
   public static void method(Person p){
        p.show();
   }

}
