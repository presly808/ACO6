package ua.artcode.week1.day2;


public class MyArray {

    private int[] mas = new int[10];
    private int size = 0;

    public void printArr(){
        for (int i = 0; i < size; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    public void add(int num){
        if(size >= mas.length){
            System.err.println("Array is full");
        } else {
            mas[size++] = num;
        }
    }

    public void removeLast(){
        size--;
    }

    public int getByIndex(int index){
        if(checkRange(index)){
            return mas[index];
        } else {
            System.err.println("Index out of range");
            return -1;
        }
    }

    private boolean checkRange(int index){
        if(index >= 0 && index < size){
            return true;
        } else {
            return false;
        }
    }


    public void setElByIndex(int index, int value){
        if(checkRange(index)){
            mas[index] = value;
        } else {
            System.err.println("Index out of range");
        }
    }




}
