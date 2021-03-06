package com.company;

public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isBlank())
            return true;
        s = s.replaceAll(" ","");
        s = s.toLowerCase();
        int flag = 0;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++; j--;
                continue;
            }
            else {
                flag = 1;
                break;
            }
        }
        return (flag == 0);
    }
}
