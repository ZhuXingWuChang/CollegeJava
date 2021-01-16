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

        System.out.println("display");
        System.out.println("date: " + date);
        System.out.println("timestamp: " + timestamp);
        System.out.println();

        System.out.println("symmetry ?");
        System.out.println("date.equals(timestamp) return: " + date.equals(timestamp));
        System.out.println("timestamp.equals(date) return: " + timestamp.equals(date));
        System.out.println();

        System.out.println("Use solution one:");
        var timestamp1 = new MyTimestamp1(0, 0, 0, 0, 0, 0, 0);
        System.out.println("date.equals(timestamp1) return:" + date.equals(timestamp1));
        System.out.println("timestamp1.equals(date) return: " + timestamp1.equals(date));
        System.out.println();

        System.out.println("Use solution two:");
        var timestamp2 = new MyTimestamp2(0, 0, 0, 0, 0, 0, 0);
        System.out.println("date.equals(timestamp2) return: " + date.equals(timestamp2));
        System.out.println("timestamp2.equals(date) return: " + timestamp2.equals(date));
        System.out.println();

        System.out.println("transitivity ?");
        var ts = new Timestamp(date.getTime());
        ts.setNanos(ts.getNanos() + 1);
        System.out.println("date.equals(ts) return: " + date.equals(ts));
        System.out.println("timestamp2.equals(ts) return: " + timestamp2.equals(ts));
        System.out.println("date: " + date.getTime());
        System.out.println("timestamp2:" + timestamp2.getTime());
        System.out.println("ts: " + ts.getTime());
    }
}
