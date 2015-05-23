package ua.artcode.week5.day1;

/**
 * 1. Declare Generic Type in class
 *          T,E,K,V
 * 2. Use gen type in class
 *
 */
public class Container<T> {

    private T val;

    public Container() {
    }

    public Container(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public void tryCreate(){
        //T instance = new T();
    }


    public static void test(){
        //T t;
    }
}
