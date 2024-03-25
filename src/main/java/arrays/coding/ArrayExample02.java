package arrays.coding;

public class ArrayExample02 {

    public static void main(String[] args) {
        String[] names = new String[5];

        names[0] = "Susan";
        names[1] = "John";
        names[2] = "Nil";
        names[3] = "Jerry";
        names[4] = "Steve";

        for (int i = 0; i < names.length; i++) {
            System.out.println("Names : " + names[i]);
        }

        //String n = names[5];
        //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }
}
