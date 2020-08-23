package leetcode;

public class Middle11 {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int start =0; int end = height.length - 1;
        while (start < end){
            int a = Math.min(height[start], height[end]);
            int b = end - start;
            maxArea = Math.max(maxArea,a*b);
            if(height[start] > height[end]){
                end--;
            }else {
                start++;
            }
        }
        return maxArea;
    }
}
