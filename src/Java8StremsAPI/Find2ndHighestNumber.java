package Java8StremsAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Find2ndHighestNumber {

    //Find the 2nd highest number in a list of integers.
    static void main() {

        //2,4,5,6,8
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);

        //Collections.sort(list);
        Integer i = list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(i);
    }

}

