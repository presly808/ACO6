package ua.artcode.io;

import java.io.File;


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

    public static void findByName(File file, String keyWord){

        if(file.getName().contains(keyWord)){
            System.out.println(file.getAbsolutePath());
        }

        if(file.isDirectory()){
            for (File child : file.listFiles()) {
                findByName(child, keyWord);
            }
        }

    }

    public static String findByNameWithRes(File file, String keyWord){

        String res = "";

        if(file.getName().contains(keyWord)){
            res += file.getAbsolutePath() + "\n";
        }

        if(file.isDirectory()){
            for (File child : file.listFiles()) {
                String childReturnedRes = findByNameWithRes(child, keyWord);
                res += childReturnedRes;
            }
        }

        return res;

    }

}
