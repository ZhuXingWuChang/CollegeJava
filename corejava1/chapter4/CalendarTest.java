package corejava1.chapter4;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Java核心技术4-1.
 * 这个程序的重点是向你展示如何使用一个类的接口来完成相当复杂的任务,而无需了解实现细节.
 */

public class CalendarTest {
    public static void main(String[] args) {
        // LocalDate的now方法能够获取“此时此刻的日期”
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        // Date类的minusDays方法的功能是：Date类的对象的n天前的日期（这里n位“today-1”）
        date = date.minusDays(today - 1); // set to start of month
        // DayOfWeek类的getDayOfWeek方法：获取当前Date类的对象的日期是星期几
        DayOfWeek weekday = date.getDayOfWeek();
        // DayOfWeek类的getValue方法：让星期几转换位对应的数字
        int value = weekday.getValue();

        // 打印日历的表头
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }

        // Date类的getMonthValue方法：获取对象的月份的数值
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            // 与上面的minusDays方法对应，将当前的天数+1
            date = date.plusDays(1);
            // 如果加了一天之后，到星期一了，那么换行
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }

        // 现在整个表头打印好了，如果这个时候不是星期一，那么换行
        // 因为如果是星期一，已经在新的一行了，所以不用换行
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
