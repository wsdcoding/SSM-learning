import org.dom4j.Document;
import org.dom4j.DocumentException;

import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws DocumentException {
      /*  // 第一种properties读写
        Properties pop = new Properties();
        try {
            pop.load(new FileInputStream("resources/test.properties"));
            System.out.println(pop.getProperty("url"));
            System.out.println(pop.getProperty("driver"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
 //第二种：xml读写 dom4j
        SAXReader reader = new SAXReader();
        Document doc = reader.read(new File("resources/demo.xml"));
        Element eml = doc.getRootElement();
        System.out.println(eml.attribute("color").getValue());
//        System.out.println(eml.getText());    //这里注释的都是其他方法
//        System.out.println(eml.getName());
//        System.out.println(eml.getQualifiedName());
        List<Element> list = eml.elements("student"); //获取xml中student根节点下的所有元素
        for (Element em : list){
            System.out.println(em.element("name").getText());
            System.out.println(em.element("age").getText());//x path 路径标识符
        }

    }

}
