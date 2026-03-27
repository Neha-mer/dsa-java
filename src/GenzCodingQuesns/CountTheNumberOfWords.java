package GenzCodingQuesns;

import java.util.HashMap;
import java.util.Map;

public class CountTheNumberOfWords {
    static void main() {
        String str = "My Name  is   Name  Name";
        //count the number of words in the string
       /* int count = 0;

        for (String s : str.split("\\&")) {
            // System.out.println(s);
            count++;
        }*/
        //System.out.println(count);
        Map<String, Integer> map = new HashMap<>();
        for (String s : str.split("\\s+")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        System.out.println(map);
    }
}
