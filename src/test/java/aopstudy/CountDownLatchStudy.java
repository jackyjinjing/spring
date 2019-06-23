package aopstudy;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * @author qilong.jj
 * @date 2019/6/22 10:48 PM
 */

public class CountDownLatchStudy {
    public static  CountDownLatch countDownLatch = new CountDownLatch(2);


    @Test
    public  void main() {
        try {
            Thread t1 = new Thread(new T("t1"));
            t1.start();
            Thread t2 = new Thread(new T("t2"));
            t2.start();
            countDownLatch.await();
            System.out.println("main complete");

        }catch (InterruptedException e){
            System.out.println(JSON.toJSONString(e));
        }
    }

    class T implements Runnable{

        private String name;

        public T(String name) {
            this.name = name;
        }

        public void run() {
            try {
                System.out.println(System.currentTimeMillis());
                Thread.sleep(1000L);
                System.out.println(System.currentTimeMillis()+name+"运行完成");
                countDownLatch.countDown();
            }catch (InterruptedException e){
                System.out.println(JSON.toJSONString(e));
            }finally {
                countDownLatch.countDown();
            }
        }
    }
}
