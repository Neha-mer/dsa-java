package Java8StremsAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMinandMax {
    static void main() {
        //Find the maximum and minimum values in a list of integers.

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);

        int max = list.stream().max(Integer::compareTo).orElseThrow();
        int min = list.stream().min(Integer::compareTo).orElseThrow();
    }
}