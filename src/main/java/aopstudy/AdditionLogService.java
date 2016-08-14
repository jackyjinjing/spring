package aopstudy;

import org.aspectj.lang.JoinPoint;

/**
 * Created by Jacky on 2016/8/13.
 */
public class AdditionLogService {

    public void beforeAdd(JoinPoint joinPoint){
        Object obj[] = joinPoint.getArgs();
        System.out.println("º∆À„ "+obj[0]+"+"+obj[1]+"÷Æ«∞");
    }

    public void afterAdd(JoinPoint joinPoint){
        
    }
}
