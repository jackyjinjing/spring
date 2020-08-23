package leetCode;

import leetcode.Middle5;
import org.junit.Test;

public class Middle5Test {

    private Middle5 middle5 = new Middle5();

    @Test
    public void test(){
        System.out.println(middle5.longestPalindrome("aba"));
        System.out.println(middle5.longestPalindrome("abbac"));
    }

}
