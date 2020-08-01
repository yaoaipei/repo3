package Thread;

public class test2 {



    public static void main(String[] args) {
        Saler saler = new Saler();
        Thread t1 = new Thread(saler);
        Thread t2 = new Thread(saler);
          t1.start();
          //这里加个延时，为了不让CPU一下子把这三条指令一下子执行完，
        // 导致全部都是输出bbbb
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {

        }
        saler.flag=false; //加个flag，非常好，让两个线程分别运行不同的同步代码块
        t2.start();
    }

}
