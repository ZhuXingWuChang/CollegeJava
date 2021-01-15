package corejava.chapter5.equals;

import java.util.Date;
import java.sql.Timestamp;

/**
 * This program debug Java.util.Date.equals and Java.sql.Timestamp.equals.
 * It doesn't come from the book, it's my programed.
 *
 * @author ZhuXingWuChang
 */
public class DateAndTimestamp {
    public static void main(String[] args) {
        var date = new Date(0, 0, 0, 0, 0, 0);
        var timestamp = new Timestamp(0, 0, 0, 0, 0, 0, 0);

        System.out.println("date: " + date);
        System.out.println("timestamp: " + timestamp);
        System.out.println();

        /*
        自反性。对应任何非null的引用值x，x.equals(x) 必须返回true。
        对称性。对于任何非null的引用值x和y，当且仅当y.equals(x) 返回true时，x.equals(y) 必须返回true。
        传递性。对于任何非null的引用值x、y和z，如果x.equals(y) 必须返回true，且y.equals(z) 返回true，那么x.equals(z) 也必须返回true。
        一致性。对于任何非null的引用值x和y，只要equals比较用到的信息没被改，多次x.equals(y)一致地返回true，或一致返回false。
        对于任何非null的引用值x，x.equals(null)必须返回fasle
         */

        System.out.println("date.equals(timestamp) return: " + date.equals(timestamp));
        System.out.println("timestamp.equals(date) return: " + timestamp.equals(date));
        System.out.println();

        // Use solution one
        System.out.println("Use solution one:");
        var timestamp1 = new MyTimestamp1(0, 0, 0, 0, 0, 0, 0);
        System.out.println("date.equals(timestamp1) return:" + date.equals(timestamp1));
        System.out.println("timestamp1.equals(date) return: " + timestamp1.equals(date));
        System.out.println();

        // Use solution two
        System.out.println("Use solution two:");
        var timestamp2 = new MyTimestamp2(0, 0, 0, 0, 0, 0, 0);
        System.out.println("date.equals(timestamp2) return: " + date.equals(timestamp2));
        System.out.println("timestamp2.equals(date) return: " + timestamp2.equals(date));
        System.out.println();

        var ts = new Timestamp(date.getTime());
        ts.setNanos(ts.getNanos() + 1);
        System.out.println("date.equals(ts) return: " + date.equals(ts));
        System.out.println("timestamp2.equals(ts) return: " + timestamp2.equals(ts));

        System.out.println("date: " + date.getTime());
        System.out.println("timestamp2:" + timestamp2.getTime());
        System.out.println("ts: " + ts.getTime());
    }
}
