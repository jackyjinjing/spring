package aopstudy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import utils.SpringContextUtils;

/**
 * Created by Jacky on 2016/8/13.
 */
public class HelloWorldTest {

    @Test
    public void testSay() throws Exception {
        ApplicationContext context = SpringContextUtils.getContext();
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
        helloWorld.say();
    }
}
