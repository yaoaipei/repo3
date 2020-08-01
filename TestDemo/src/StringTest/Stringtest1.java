package StringTest;

public class Stringtest1 {

    public static void main(String[] args) {

        String s1="Helloword";
        String s2 = new String("Helloword");
        String s3="Hello";
        String s4="word";
        String s5="Hello"+"word";
        String s6=s3+s4;
        System.out.println(s1==s2);
        System.out.println(s1==s3+s4);
        System.out.println(s1==s6);
        System.out.println(s1==s5);
        String s66 = s6.intern();
        System.out.println(s66);
        System.out.println(s66==s6);
        System.out.println(s2==s2.intern());
    }

}
