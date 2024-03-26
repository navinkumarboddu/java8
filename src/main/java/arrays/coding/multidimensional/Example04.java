package arrays.coding.multidimensional;

public class Example04 {

    public static void main(String[] args) {
        float[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (float[] row: matrix){
            for(float element: row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
