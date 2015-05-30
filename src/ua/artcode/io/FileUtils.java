package ua.artcode.io;

import java.io.File;

/**
 * Created by serhii on 30.05.15.
 */
public class FileUtils {

    // dir command example
    public static void showFolderContent(String path){
        File dir = new File(path);

        // validation of input data

        File[] children = dir.listFiles();
        for (File child : children) {
            if(child.isDirectory()){
                System.out.println("D - " + child.getName());
            } else {
                System.out.println("F - " + child.getName());
            }
        }

    }

    public static void tree(File dir, String spaces){

        System.out.println(spaces + dir.getName());

        if(dir.isDirectory()) {
            for(File child : dir.listFiles()){
                tree(child, spaces + "|---");
            }
        }
    }

}
