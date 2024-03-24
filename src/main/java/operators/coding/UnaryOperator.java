package operators.coding;

public class UnaryOperator {

    public static void main(String[] args) {

        int x = 0;
        x++;
        System.out.println(x);

        x--;
        System.out.println(x);

        x=5;
        double y = 2 + 2 * x--;
        System.out.println(y); //prints 12
        System.out.println(x); //prints 4

        x=5;
        y = 2 + 2 * --x;
        System.out.println(y); //prints 10
        System.out.println(x); //prints 4

        //unary operator has more precedence than Arithmetic Operator
    }
}
