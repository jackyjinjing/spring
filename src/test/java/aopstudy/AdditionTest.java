package aopstudy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jacky on 2016/8/13.
 */
public class AdditionTest {

    @Test
    public void testAdd() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
        Addition addition = (Addition) context.getBean("addtion");
        addition.add(2, 5);
    }
}
