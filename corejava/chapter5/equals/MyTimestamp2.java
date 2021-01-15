package corejava.chapter5.equals;

import java.sql.Timestamp;
import java.util.Date;

/**
 * The second error solution.
 *
 * @author ZhuXingWuChang
 */
public class MyTimestamp2 extends Timestamp {

    public MyTimestamp2(int year, int month, int date, int hour, int minute, int second, int nano) {
        super(year, month, date, hour, minute, second, nano);
    }

    @Override
    public boolean equals(java.lang.Object ts) {
        if (ts instanceof Timestamp) {
            return this.equals((Timestamp) ts);
        } else if (ts instanceof Date) {
            return this.getTime() == ((Date) ts).getTime();
        } else {
            return false;
        }
    }
}