package Java8StremsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EvenNumber {
    static void main() {
        List<Integer> list = Arrays.asList(2, 5, 8, 4, 8);
        List<String> words = Arrays.asList("Java", null, "Stream", null, "API");
        List<String> nonNullWords = words.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        System.out.println(nonNullWords);
        list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        double average = numbers.stream().mapToInt(Integer::intValue)

                .average()
                .orElse(0.0);
        System.out.println(average);
    }
}
