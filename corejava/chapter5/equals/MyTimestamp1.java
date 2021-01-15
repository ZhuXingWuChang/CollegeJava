package corejava.chapter5.equals;

import java.sql.Timestamp;
import java.util.Date;

/**
 * The first error solution.
 *
 * @author ZhuXingWuChang
 */
public class MyTimestamp1 extends Timestamp {

    public MyTimestamp1(int year, int month, int date, int hour, int minute, int second, int nano) {
        super(year, month, date, hour, minute, second, nano);
    }

    @Override
    public boolean equals(java.lang.Object ts) {
        if (ts instanceof Date) {
            return this.equals((Timestamp) ts);
        } else {
            return false;
        }
    }
}