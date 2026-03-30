package CodingQuesnthirty.patterns.SlidWindowVariableSizeWithPrefixSum;

import java.util.HashMap;
import java.util.Map;

public class LongestArrayWithKDistinctValue {


    static void main() {

        String s = "abbacebebebebe";
        int k = 3;
        // code here

        int i = 0;
        int j = 0;
        int sum = 0;
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = Integer.MIN_VALUE;
        while (j < s.length()) {
            if (map.size() < k) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                System.out.println("map size" + map.size());

                j++;
                //System.out.println("j" + j);
            } else if (map.size() == k) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            } else if (map.size() > k) {
                while (map.size() > k) {
                    System.out.println("when map is bigger" + map.size());
                    map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;


            }


        }
        System.out.println(maxLength);
    }
}

