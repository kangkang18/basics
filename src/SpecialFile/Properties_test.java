package SpecialFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties_test {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        System.out.println(properties);

        properties.load(new FileReader("F:\\Language_study\\java\\basics\\basics\\src\\SpecialFile\\users.properties"));


        System.out.println(properties.getProperty("coco"));
    }
}
