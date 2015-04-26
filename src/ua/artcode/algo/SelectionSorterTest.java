package ua.artcode.algo;

import java.util.Arrays;

/**
 * Created by serhii on 26.04.15.
 */
public class SelectionSorterTest {

    public static void main(String[] args) {
        int[] mas = {34,12,4,5,22,12,65,87};
        SelectionSorter selectionSorter = new SelectionSorter();
        selectionSorter.sort(mas);

        System.out.println(Arrays.toString(mas));

    }

}
