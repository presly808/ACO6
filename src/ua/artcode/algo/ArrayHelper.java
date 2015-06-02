package ua.artcode.algo;

/**
 * Created by serhii on 31.05.15.
 */
public class ArrayHelper {


    public static int findMinInRange(int[] mas, int left, int right){
        int minI = left;
        for(int i = left; i < right; i++){
            if(mas[i] < mas[minI]){
                minI = i;
            }
        }
        return minI;
    }

    public static void swap(int[] mas, int a, int b){
        int temp = mas[a];
        mas[a] = mas[b];
        mas[b] = temp;
    }
}
