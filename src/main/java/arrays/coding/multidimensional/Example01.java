package arrays.coding.multidimensional;

import java.util.Arrays;

public class Example01 {

    public static void main(String[] args) {
        float[][] matrix = new float[3][3];

        float[][] matrix2 = new float[3][];
        for(int i=0;i<matrix2.length;i++){
            matrix2[i] = new float[i];
        }
    }
}
