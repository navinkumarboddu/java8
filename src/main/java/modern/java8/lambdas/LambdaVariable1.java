package modern.java8.lambdas;

public class LambdaVariable1 {

    public static void main(String[] args) {
        int i = 0;

        //Variable 'i' is already defined in the scope
        /*Consumer<Integer> c1 = (i) -> {
            System.out.println("Value is:" + i);
        };*/

        //Variable 'i' is already defined in the scope
        /*Consumer<Integer> c1 = (i1) -> {
            int i = 1;
            System.out.println("Value is:" + i);
        };*/


    }
}
