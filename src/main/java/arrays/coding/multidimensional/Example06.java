package arrays.coding.multidimensional;

import java.util.Arrays;

public class Example06 {

    public static void main(String[] args) {
        int[][] numbers1 = {{1,2,3},{4,5}};
        int[][] numbers2 = numbers1.clone(); //swallow copy

        System.out.println(numbers1 == numbers2);
        System.out.println(numbers1[0] == numbers2[0]);
        System.out.println(numbers1[1] == numbers2[1]);

        numbers2[0][1] = 7;
        System.out.println(Arrays.deepToString(numbers1));
    }
}
