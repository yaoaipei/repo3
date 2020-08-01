package Test4;

public class reflect {


    private static Object reflect;

    public void main(String[] args) {

//            Outer outer=new Outer();
//        try {
//            Class.forName(String.valueOf(outer));
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        Class<Outer> outerClass = Outer.class;


        Class<? extends Test4.reflect> aClass = this.getClass();


    }

}
