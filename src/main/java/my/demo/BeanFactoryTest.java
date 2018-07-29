package my.demo;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import static org.junit.Assert.assertEquals;

/**
 * @author cgb
 * @create 2018-07-29
 **/
public class BeanFactoryTest {

    @Test
    public void testSimpleLoad(){
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean bean = (MyTestBean)bf.getBean("myTestBean");
        assertEquals("testStr", bean.getTestStr());
    }
}
