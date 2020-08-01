package Thread;

public class Saler implements Runnable {


    private static int tickes=100;

     boolean flag=true;

    @Override
    public void run() {
     if (flag==true)
         while (true){
             synchronized (this){ //这个是以代码块的方法同步的
                 if (tickes>100){
                     try {
                         Thread.sleep(10);
                     }catch (InterruptedException e){ }
                     System.out.println(Thread.currentThread().getName()+"...aaa..."+tickes--);
                 }
             }
         }

         else{
             while (true){

             }
     }
    }



    //这个是用函数的的方法进行同步
    public synchronized void sale(){

        if(tickes>0){
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){

            }
            System.out.println(Thread.currentThread().getName()+"...bbb..."+tickes--);
        }
    }
}
