package CodingQuesnthirty.patterns.twodarray;

public class FindSum2DArray {
    static int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    public static void main(String[] args) {

      
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {

                //sum = sum + matrix[i][j] * matrix[i][j];
                sum = sum + matrix[i][j];

            }
            System.out.println(sum);


        }


    }

}
