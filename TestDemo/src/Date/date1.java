package Date;

import java.time.LocalDateTime;
import java.util.Calendar;

public class date1 {
    public static void main(String[] args) {

        //获取当前时间
        //月份得要加一天
        Calendar ca1 = Calendar.getInstance();
        System.out.println(ca1);
        int year = ca1.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println(ca1.get(Calendar.MONTH)+1);
        System.out.println(ca1.get(Calendar.DATE));
        System.out.println(ca1.get(Calendar.HOUR_OF_DAY));
        System.out.println(ca1.get(Calendar.MINUTE));
        System.out.println(ca1.get(Calendar.SECOND));

        System.out.println("--------------------------");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //分别获取年月日
        System.out.println(now.getYear());
        System.out.println(now.getMonthValue()); // 1 - 12 阿拉伯数字月份
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());


        System.out.println("-----------------------------");

       // 如何取得从 1970 年 1 月 1 日 0 时 0 分 0 秒到现在的毫秒数？
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        System.out.println(timeInMillis);

        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        System.out.println("------------------------------");


        // 如何取得某月的最后一天？(2017-11-19-wl)
            Calendar c= Calendar.getInstance();
            c.add(Calendar.MONTH,0);
            c.set(Calendar.DAY_OF_MONTH,1);//设置为 1 号,当前日期既为本月第一天


    }
}
