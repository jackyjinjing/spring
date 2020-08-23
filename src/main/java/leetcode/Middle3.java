package leetcode;


import java.util.HashSet;
import java.util.Set;

public class Middle3 {

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        Set<Character> characters = new HashSet<>();
        while(right < s.length()){
            if((s.length() - left) < maxLength){
                break;
            }
            if(characters.contains(s.charAt(right))){
                left ++;
                maxLength = Math.max(maxLength,characters.size());
                characters.clear();
                right = left;
                continue;
            }else {
                characters.add(s.charAt(right));
                if(right == s.length() -1){
                    return Math.max(maxLength,characters.size());
                }
                right++;
            }
        }
        return maxLength;
    }

}
