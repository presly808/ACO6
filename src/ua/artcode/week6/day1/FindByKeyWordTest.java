package ua.artcode.week6.day1;

import ua.artcode.io.FileUtils;

import java.io.File;

/**
 * Created by serhii on 31.05.15.
 */
public class FindByKeyWordTest {


    public static void main(String[] args) {
        //FileUtils.findByName(new File("/home/serhii/IdeaProjects/ACO6"),"Stack");
        String res = FileUtils.findByNameWithRes(new File("/home/serhii/IdeaProjects/ACO6/src/ua/artcode/week5"),"Week");
        System.out.println(res);
    }
}
