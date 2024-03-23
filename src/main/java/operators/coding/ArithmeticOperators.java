package operators.coding;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int x =2 * 2 + 3 -1;
        System.out.println(x);

        x = 2 * 3 + 4 / 2 - 1;
        System.out.println(x); //7

        x = (2 * 3) + 4 / (2 - 1);
        System.out.println(x); //10

        x = 100 % 3;
        System.out.println(x);
    }

}
