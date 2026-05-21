package CodingQuesnthirty.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    static void main() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        String word;
        String sortedWords;
        char[] comparingWord;
        String comparingString;
        List<List<String>> listString = new ArrayList<>();
        List<String> list = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (visited[i] == true) {
                continue;
            }
            List<String> groupString = new ArrayList<>();


            char[] sortChar = strs[i].toCharArray();
            Arrays.sort(sortChar);
            sortedWords = new String(sortChar);

            groupString.add(strs[i]);
            visited[i] = true;
            for (int j = i + 1; j < strs.length; j++) {
                if (visited[j] == true) {
                    continue;
                }
                comparingWord = strs[j].toCharArray();
                Arrays.sort(comparingWord);
                comparingString = new String(comparingWord);

                if (sortedWords.equals(comparingString)) {
                    groupString.add(strs[j]);
                    visited[j] = true;


                }

            }

            listString.add(groupString);
        }
        System.out.println(Arrays.toString(listString.toArray()));
    }


}