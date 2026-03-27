package CodingQuesnthirty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindContinuousNumber {

    static int[] arr = {100, 4, 200, 1, 3, 2};
    static List<Integer> newArr = new ArrayList<>();

    public static void main(String[] args) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                newArr.add(arr[i]);
            }
        }

        Stream.of(newArr).forEach(System.out::println);
    }
}
