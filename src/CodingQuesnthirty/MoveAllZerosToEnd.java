package CodingQuesnthirty;

import java.util.Arrays;

public class MoveAllZerosToEnd {

    static void main() {
        int[] arr = {1, 0, 3, 0, 0, 5};
        int[] nozeros = new int[arr.length];

        int length = arr.length;
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {

            if (arr[i] != 0) {

                nozeros[count] = arr[i];
                count++;
            }

        }


        System.out.println(Arrays.toString(nozeros));
    }
}
