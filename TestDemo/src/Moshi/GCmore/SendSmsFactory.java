package Moshi.GCmore;

public class SendSmsFactory implements Provider {
    @Override
    public Sender provider() {
        return new SmsSender();
    }
}
