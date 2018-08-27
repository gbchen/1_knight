package my.demo;

import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.w3c.dom.Element;

/**
 * @author cgb
 * @create 2018-07-31
 **/
public class MyBeanDefinitionDocumentReader extends DefaultBeanDefinitionDocumentReader {
    @Override
    protected void preProcessXml(Element root) {
        System.out.println("~~~~pre~~~~");
    }

    @Override
    protected void postProcessXml(Element root) {
        System.out.println("~~~~post~~~~");
    }
}
