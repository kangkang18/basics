package SpecialFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Properties_test2 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("coco","168");
        properties.setProperty("coco","168");
        properties.setProperty("coco","168");

        properties.store(new FileWriter("F:\\Language_study\\java\\basics\\basics\\src\\SpecialFile\\users2.properties"),"new");

    }
}
