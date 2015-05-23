package ua.artcode.week5.day1;

/**
 * Created by serhii on 23.05.15.
 */
public class TestWeekDay {

    public static void main(String[] args) {
        WeekDay day1 = WeekDay.MONDAY;

        System.out.println(day1.name());
        System.out.println(day1.ordinal());
        System.out.println(day1.getUrkName());

        WeekDay[] days = WeekDay.values();

        WeekDay day2 = WeekDay.valueOf("TUESDAY");

        System.out.println();
    }

}
