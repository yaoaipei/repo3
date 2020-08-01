public class TESTS {

    public static void main(String[] args) {

        Person person;

        person=new Person("张三");
        person=new Person("李四");

        //System.out.println(person.name);
       // System.out.println(person);

        String s1="yao";
        String s2="yao";
       // System.out.println(s1==s2);
        //System.out.println(s1.equals(s2));

        String s = new String("xin");
        String ss = new String("xin");
        System.out.println(s==ss);
        System.out.println(s.equals(ss));
    }
}
