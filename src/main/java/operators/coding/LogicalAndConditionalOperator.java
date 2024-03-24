package operators.coding;

public class LogicalAndConditionalOperator {

    public static void main(String[] args) {

        boolean x = (1<2) | (5>4);
        System.out.println(x);

        int i = 3;
        boolean j = (i >= 3) || (++i < 5);
        System.out.println(i);

    }
}