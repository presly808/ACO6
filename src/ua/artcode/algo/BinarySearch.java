package ua.artcode.algo;

/**
 * Created by serhii on 13.06.15.
 */
public class BinarySearch {

    public static int find(int[] mas, int key) {

        int start = 0;
        int end = mas.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mas[mid] == key) {
                return mid;
            } else if (key > mas[mid]) {
                start = mid + 1;
            } else if (key < mas[mid]) {
                end = mid - 1;
            }
        }

        return -1;

    }


    public static int findRecCool(int[] mas, int key, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        return mas[mid] == key ? mid :
                findRecCool(mas, key,
                key > mas[mid] ? mid + 1 : start,
                key < mas[mid] ? mid - 1 : end);
    }

    public static int findRec(int[] mas, int key, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (mas[mid] == key) {
            return mid;
        } else if (key > mas[mid]) {
            start = mid + 1;
        } else if (key < mas[mid]) {
            end = mid - 1;
        }


        return findRec(mas,key,start,end);
    }


}
