package utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jacky on 2016/8/13.
 */
public class SpringContextUtils {

    public static ApplicationContext getContext(){
        return new ClassPathXmlApplicationContext("spring-beans.xml");
    }
}
