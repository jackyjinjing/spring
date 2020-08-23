package leetcode;

public class Middle5 {

    public String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = expand1(i, s);
            String s2 = expand2(i, s);
            if(s1.length() > result.length()){
                result = s1;
            }
            if(s2.length() > result.length()){
                result = s2;
            }
        }
        return result;
    }

    private String expand2(int i, String s) {
        String result = String.valueOf(s.charAt(i));

        int j = i;
        int k = i + 1;
        while (j >= 0 && k < s.length()) {
            if (s.charAt(j) == s.charAt(k)) {
                result = s.substring(j,k+1);
                j--;
                k++;
            } else {
                break;
            }
        }
        return result;
    }

    private String expand1(int i, String s) {
        String result = String.valueOf(s.charAt(i));
        int j = i - 1;
        int k = i + 1;
        while (j >= 0 && k < s.length()) {
            if (s.charAt(j) == s.charAt(k)) {
                result = s.substring(j,k+1);
                j--;
                k++;
            } else {
                break;
            }
        }
        return result;
    }
}
