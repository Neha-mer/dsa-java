package Java8StremsAPI;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountEachCharacter {
    static void main(String[] args) {
        String s = "Neha";
        Map<Character, Long> res = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()));
        System.out.println(res);
        //return boolean result
        Predicate<Integer> predicate = x -> x % 2 == 0;
        predicate.test(4);

        //doesnt return any value
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Neha");
        //work for you
        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer, Integer> tripleIt = x -> x * 3;
        System.out.println(doubleIt.andThen(tripleIt).apply(100));

        //Take two values
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> (x + y) % 2 == 0;
        System.out.println(biPredicate.test(5, 5));
        //  Optional.ofNullable(noteList).orElseGet(Collections.emptyList().stream().filter(Objects::nonNull).map(note->Notes::getTagName).forEach(System.out::println);

        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> set = new HashSet<>();
        myList.stream().filter(x -> !set.add(x)).forEach(System.out::println);

        List<Integer> myList2 = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        myList2.stream().map(x -> x + "").forEach(System.out::println);
        //find even number

        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        // list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        int max = list.stream().max(Integer::compare).get();
        // System.out.println(max);

        String input = "Java articles are Awesome";

        Map<Character, Long> result = input.chars().filter(x -> !Character.isWhitespace(x))

                .mapToObj(c -> Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        //.collect(Collectors.joining());
        System.out.println(result);

    }
}
