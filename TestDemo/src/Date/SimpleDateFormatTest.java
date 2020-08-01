package Date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class SimpleDateFormatTest {

    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        System.out.println("-----------------");

        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate localDate = LocalDate.now();
        String format1 = localDate.format(date2);
        System.out.println(format1);
    }
}
