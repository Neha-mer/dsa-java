package Java8StremsAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

    static void main() {

        int[] arr = {1, 2, 4, 5, 2, 1};
        Set<Integer> set = new HashSet<>();

        Arrays.stream(arr).filter(x -> !set.add(x)).forEach(System.out::println);
    }
}
