package Test;

public class Student2 implements Smoke,Dajia {
    @Override
    public void somking() {
        System.out.println("学生课下吸烟");
    }

    @Override
    public void fight() {
        System.out.println("学生课下打架");
    }
}
