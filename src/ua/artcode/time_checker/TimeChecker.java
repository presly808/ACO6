package ua.artcode.time_checker;

/**
 * Created by master on 09.05.15.
 */
public class TimeChecker {


    public static void checkTime(TimeAction action){
        long start = System.currentTimeMillis();
        action.doAction();
        long end = System.currentTimeMillis();
        System.out.printf("work time of method is %d\n", (end - start));
    }
}
