package Java8StremsAPI;

import JavaCoding.ComparableEmployeeExample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveEmptyStrings {

    static void main(String[] args) {

        String[] s = {"Java", "", "is", "a", ""};

        String[] newS = Arrays.stream(s).filter(c -> !c.isEmpty()).toArray(String[]::new);

        System.out.println(Arrays.toString(newS));


        //find unique element from a string

        String s2 = "Nnehhaa";

        s2.chars().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )) // Creates a LinkedHashMap: {N=1, n=1, e=1, h=2, a=2}
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1) // FIX: Check the count (Value), not the character (Key)
                .map(Map.Entry::getKey)          // FIX: Map the entry down to just the character
                .findFirst()
                .orElse(null);

        //Collection comparator chaining


    }
}
