package CodingQuesnthirty;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    static void main() {

        String s = "programming";
        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> duplicates = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {

            duplicates.add(s.charAt(i));


        }


        for (Character c : duplicates) {
            stringBuilder.append(c);

        }
        System.out.println(stringBuilder.toString());
    }
}
