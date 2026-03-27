package CodingQuesnthirty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIndLongestPallindromString {


    public static void main(String[] args) {
        String s = "babad";
        String n = null;
        //  Output: "bab"
        String longest = "";
        int maxLength = 1;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {

                if (s.substring(i, j).equals(new StringBuilder(s.substring(i, j)).reverse().toString())) {
                    //sub = s.substring(i, j);
                    if (s.substring(i, j).length() > longest.length()) {
                        longest = s.substring(i, j);
                        maxLength = s.substring(i, j).length();
                        list.add(longest);

                    } else if (s.substring(i, j).length() == maxLength && !list.contains(s.substring(i, j))) {
                        list.add(s.substring(i, j));
                    }


                }
            }

        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
