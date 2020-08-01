package Test;

public class outer {

    private int a;

    public class inner{
        private int a;

        public void method(){
            //局部变量
            a++;
            //inner类变量
            this.a++;
            //outer类变量
            outer.this.a++;
        }
    }

}
