package CodingQuesnthirty.patterns.prefixsum.medium.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductWithoutSelf {

    //
    static void main() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        //product=24,12,8,6]
        int product = 0;
        int[] productArr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            product = 1;
            for (int j = 0; j < list.size(); j++) {

                if (i != j) {

                    product = product * list.get(j);//1*2=2//2*3=6,//6*4=24
                    // System.out.println(product);
                }

            }
            productArr[i] = product;
            System.out.println(productArr[i]);
        }

    }
}
