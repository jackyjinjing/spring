package aopstudy;

import org.aspectj.lang.JoinPoint;

/**
 * Created by Jacky on 2016/8/13.
 */
public class AdditionLogService {

    public void beforeAdd(JoinPoint joinPoint){
        Object obj[] = joinPoint.getArgs();
        System.out.println("���� "+obj[0]+"+"+obj[1]+"֮ǰ");
    }

    public void afterAdd(JoinPoint joinPoint){
        
    }
}
