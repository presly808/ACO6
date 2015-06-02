package ua.artcode.algo;

/**
 * Created by serhii on 26.04.15.
 */
public class SelectionSorter {


    public void sort(int[] mas){
        if(mas == null || mas.length <= 1){
            return;
        }

        int pivot = 0;
        while(pivot < mas.length){
            // find min
            int minI = ArrayHelper.findMinInRange(mas, pivot, mas.length);
            ArrayHelper.swap(mas, pivot, minI);

            pivot++;
        }

    }




}
