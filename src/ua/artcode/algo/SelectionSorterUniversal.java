package ua.artcode.algo;

/**
 * Created by serhii on 26.04.15.
 */
public class SelectionSorterUniversal {


    public void sort(Comparable[] mas){
        if(mas == null || mas.length <= 1){
            return;
        }

        int pivot = 0;
        while(pivot < mas.length){
            // find min
            int minI = pivot;
            for (int i = pivot; i < mas.length; i++) {
                if(mas[i].compareTo(mas[minI]) < 0){
                    minI = i;
                }

            }

            swap(mas,pivot,minI);

            pivot++;
        }

    }

    public void swap(Object[] mas, int a, int b){
        Object temp = mas[a];
        mas[a] = mas[b];
        mas[b] = temp;
    }


}
