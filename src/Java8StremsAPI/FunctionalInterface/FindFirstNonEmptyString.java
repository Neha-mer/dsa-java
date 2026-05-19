package Java8StremsAPI.FunctionalInterface;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FindFirstNonEmptyString {

    static void main(String[] args) {
        List<String> strings = Arrays.asList("", "", "Hello", "World", "");
        Optional<String> nonEmpty = strings.stream().filter(s -> !s.isEmpty()).findFirst();

        //reverse string
        String sentence = "Java streams are powerful";
        String[] words = sentence.split(" ");
        String result = IntStream.range(0, sentence.length()).mapToObj(i -> words[words.length - 1 - i]).collect(Collectors.joining(""));

        sentence.chars().mapToObj(c -> (char) c).sorted(Comparator.reverseOrder()).forEach(System.out::println);


        System.out.println(nonEmpty);
    }
}
