package arrays.coding.multidimensional;

import java.util.Arrays;

public class Example05 {

    public static void main(String[] args) {
        String[] words = {"Hello", "World"};

        System.out.println(words);
        System.out.println(Arrays.toString(words));

        float[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matrix));

        String[][] sentences1 = {{"Hello","World"},{"How","are","you"}};
        String[][] sentences2 = {{"Hello","World"},{"How","are","you"}};

        System.out.println(Arrays.deepEquals(sentences1,sentences2));
    }
}
