package aopstudy;

import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Jacky on 2016/8/13.
 */
public class HelloWorldLogService {

    public void  beforeSay(){
        System.out.println("before hello world");
    }

    public void afterSay(){
        System.out.println("after hello world");
    }
}
