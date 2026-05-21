package Java8StremsAPI;

import javax.swing.text.html.Option;
import java.util.*;

public class SecondHighestNumber {

    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 11, 2, 8, 21, 1);

        int[] num = {1, 2, 4, 5, 6};

        Arrays.stream(num).boxed().distinct().sorted((a, b) -> b - a).skip(2).findFirst();

        Optional<Integer> numSecond = numbers.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();
    }
}
