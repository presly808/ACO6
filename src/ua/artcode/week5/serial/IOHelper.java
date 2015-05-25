package ua.artcode.week5.serial;

/**
 * Created by serhii on 24.05.15.
 */
public interface IOHelper<T> {


    void save(String path, T o);

    T load(String path);


}
