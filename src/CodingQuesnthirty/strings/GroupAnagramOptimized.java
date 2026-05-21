package CodingQuesnthirty.strings;

import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagramOptimized {
    static void main() {
        String[] strs = {"eat", "tea", "bat"};
        //  String[] strs = {"", ""};

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {

            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedKey = new String(arr);

            if (!map.containsKey(sortedKey)) {

                map.put(sortedKey, new ArrayList<>());
            }


            map.get(sortedKey).add(str);
        }

        System.out.println(new ArrayList<>(map.values()));
    }
}
