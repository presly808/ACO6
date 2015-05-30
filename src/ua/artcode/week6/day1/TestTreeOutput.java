package ua.artcode.week6.day1;

import ua.artcode.io.FileUtils;

import java.io.File;

/**
 * Created by serhii on 30.05.15.
 */
public class TestTreeOutput {


    public static void main(String[] args) {
        FileUtils.tree(new File("/home/serhii/IdeaProjects/ACO6"),"");
    }
}
