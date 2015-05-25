package ua.artcode.week5.serial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by serhii on 24.05.15.
 */
public class PilotIOHelper implements IOHelper<Pilot> {
    @Override
    public void save(String path, Pilot o) {
        try {
            PrintWriter pw = new PrintWriter(path);
            pw.println(o.toString());
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Pilot load(String path) {
        try {
            Scanner sc= new Scanner(new File(path));
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
