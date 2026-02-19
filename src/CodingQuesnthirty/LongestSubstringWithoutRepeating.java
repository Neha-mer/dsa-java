package CodingQuesnthirty;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    // Longest Substring Without Repeating Characters: Find the length of the longest
    //substring without repeating characters.
//abcabcbab, longest substring is abc
    public static void main(String[] args) {

        // String s = "";
        //String s="a";
        String s = "abcdabbcd";

        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }


        System.out.println(maxLen);
    }
}


