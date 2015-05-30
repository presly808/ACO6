package ua.artcode.week6.day1;

import ua.artcode.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by serhii on 30.05.15.
 */
public class TestFileClass {


    public static final String PATHNAME = "/home/serhii/IdeaProjects/ACO6";

    public static void main(String[] args) throws IOException {
        File dir = new File(PATHNAME);

        System.out.println("isDirectory() " + dir.isDirectory());
        System.out.println("isFile() " + dir.isFile());
        System.out.println("getName " + dir.getName());
        System.out.println("getPath " + dir.getPath());
        System.out.println("getAbsolutePath() " + dir.getAbsolutePath());
        System.out.println("exists() " + dir.exists());
        System.out.println();

        File file = new File(dir.getPath() + "/file.txt");
        if(file.exists()){
            file.delete();
        } else {
            file.createNewFile();
        }



        File ditTemp = new File(dir.getPath() + "/temp_dir");
        if(ditTemp.exists()){
            ditTemp.delete();
        } else {
            ditTemp.mkdir();
        }


        FileUtils.showFolderContent(PATHNAME);


    }


}
