package CodingQuesnthirty.patterns.twopointer.hard.bruteforce;

public class ContainerInWaterBf {
    public static void main(String[] args) {
        //1,8,6,2,5,4,8,3,7
        //49
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int h = Math.min(height[i], height[j]);
                int w = j - i;
                int area = h * w;
                maxArea = Math.max(maxArea, area);

            }


        }
        System.out.println("maxareaforater" + maxArea);
    }
}

