package ua.artcode.algo;

import static ua.artcode.algo.ArrayHelper.*;

public class BubbleSort {

    public static void sort(int[] mas){

        for (int j = 0; j < mas.length; j++) {
            // move max to end
            for (int i = 0; i < mas.length - 1 - j; i++) {
                if(mas[i] > mas[i+1]){
                    swap(mas,i,i+1);
                }
            }
        }
    }


}
