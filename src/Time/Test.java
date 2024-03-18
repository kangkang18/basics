package Time;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String kcy = "2023年11月11日 0:01:18";
        String kry = "2023年11月11日 0:10:57";

        //把字符串时间解析成日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDt = sdf.parse(start);
        Date endtDt = sdf.parse(end);
        Date kcyDt = sdf.parse(kcy);
        Date krytDt = sdf.parse(kry);

//把日期对象转换成时间毫秒值来判断
        long startTime = startDt.getTime();
        long endTime = endtDt.getTime();
        long kcyTime = kcyDt.getTime();
        long kryTime = krytDt.getTime();

        if(kryTime >= startTime && kryTime <= endTime){
            System.out.println("success");
        }else {
            System.out.println("error");
        }

        if(kcyTime >= startTime && kcyTime <= endTime){
            System.out.println("success");
        }else {
            System.out.println("error");
        }
    }
}
