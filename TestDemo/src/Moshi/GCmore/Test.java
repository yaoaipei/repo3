package Moshi.GCmore;

public class Test {
    public static void main(String[] args) {

        Provider provider= new SendSmsFactory();

        Sender sender = provider.provider();
        sender.Send();
    }
}
