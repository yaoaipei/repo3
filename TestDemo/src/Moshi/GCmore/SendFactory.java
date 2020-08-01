package Moshi.GCmore;

public class SendFactory {

    public Sender produceMail(){
      return new Senderimpl();
    }


    public Sender produceSms(){
        return new Senderimpl2();
    }
}




