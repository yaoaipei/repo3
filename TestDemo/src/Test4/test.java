package Test4;

import java.util.ArrayList;
import java.util.List;

public class test {
    //静态代理通常只代理一个类，动态代理是代理一个接口下的多个实现类。

    final List<String> list=new ArrayList<String>();

    public static void main(String[] args) {

        new C().px();

    }


}
