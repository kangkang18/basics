package Xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class xml_test {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();

        Document document = saxReader.read("F:\\Language_study\\java\\basics\\basics\\src\\Xml\\helloworld.xml");

        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());

    }
}
