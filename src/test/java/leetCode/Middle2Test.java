package leetCode;

import com.alibaba.fastjson.JSON;
import leetcode.ListNode;
import leetcode.Middle2;
import org.junit.Test;

public class Middle2Test {

    private Middle2 middle2 = new Middle2();

    @Test
    public void test(){
        ListNode listNode = middle2.addTwoNumbers(new ListNode(5, new ListNode(6)),
                new ListNode(8, new ListNode(9)));
        System.out.println(JSON.toJSONString(listNode));
    }



}
