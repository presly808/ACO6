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
            int minI = findMinInRange(mas,pivot,mas.length);
            swap(mas, pivot, minI);

            pivot++;
        }

    }

    public int findMinInRange(int[] mas, int left, int right){
        int minI = left;
        for(int i = left; i < right; i++){
            if(mas[i] < mas[minI]){
                minI = i;
            }
        }
        return minI;
    }

    public void swap(int[] mas, int a, int b){
        int temp = mas[a];
        mas[a] = mas[b];
        mas[b] = temp;
    }


}
