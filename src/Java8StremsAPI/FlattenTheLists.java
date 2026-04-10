package Java8StremsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenTheLists {

    //Flatten nested lists and return only even numbers.
    static void main() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 2, 3));
        list.add(Arrays.asList(4, 2, 3));
        list.add(Arrays.asList(5, 2, 3));
        list.add(Arrays.asList(6, 2, 3));


        System.out.println(list);

        List<Integer> list1 = list.stream().flatMap(inner -> inner.stream()).filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);
    }


}
