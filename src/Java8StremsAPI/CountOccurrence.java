package Java8StremsAPI;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountOccurrence {
    static void main() {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        String str = "swiss";
        Optional<Map.Entry<Character, Long>> count = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue() == 1).findFirst();
        Map<String, Long> map = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
        System.out.println(count);
    }
}
