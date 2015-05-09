package ua.artcode.time_checker;

import java.sql.Time;

/**
 * Created by master on 09.05.15.
 */
public class TestTimeChecker {

    public static void main(String[] args) {
        int size = 100000;

        TimeAction action1 = new MyActionStringConcat(size);
        TimeChecker.checkTime(action1);

        TimeChecker.checkTime(new ConcatStringBuilderAction(size));
    }
}

class ConcatStringBuilderAction implements TimeAction {

    private int size;

    public ConcatStringBuilderAction(int size) {
        this.size = size;
    }

    @Override
    public void doAction() {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < size; i++) {
            s.append("*");
        }

        String res = s.toString();
    }
}

class MyActionStringConcat implements TimeAction {

    private int count;

    public MyActionStringConcat(int count) {
        this.count = count;
    }

    @Override
    public void doAction() {
        String s = "";

        for (int i = 0; i < count; i++) {
            s = s + "*";
        }
    }
}
