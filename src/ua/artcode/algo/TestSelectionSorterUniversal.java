package ua.artcode.algo;

import java.util.Arrays;

/**
 * Created by serhii on 26.04.15.
 */
public class TestSelectionSorterUniversal {

    public static void main(String[] args) {
        Robot r1 = new Robot(100 ,"R2D2",2333);
        Robot r2 = new Robot(120,"C3po",10000);
        Robot r3 = new Robot(1000,"Bender",9898);

        Comparable c = new Robot(1000,"Bender",9898);

        Robot[] robots = new Robot[3];
        robots[0] = r1;
        robots[1] = r2;
        robots[2] = r3;

        SelectionSorterUniversal universal =
                new SelectionSorterUniversal();
        universal.sort(robots);

        String strRobots = Arrays.toString(robots);
        System.out.println(strRobots);
    }
}
