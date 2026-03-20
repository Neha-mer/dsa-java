package CodingQuesnthirty.patterns.twodarray;

import java.util.Arrays;

public class FindSumOfCoulmn {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 4, 5},
                {4, 5, 6, 7},
                {7, 8, 9, 10}
        };//System.out.println(matrix.length);
        /// Arrays.stream(matrix[2]).forEach(System.out::println);

        for (int i = 0; i < matrix.length; i++) {

            int a;
            for (int j = 0; j < matrix.length; j++) {
                // System.out.println(matrix[i][j]);
                a = matrix[i][j];
                System.out.println(a);
            }


        }

    }

}
