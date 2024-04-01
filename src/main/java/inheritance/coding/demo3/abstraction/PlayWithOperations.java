package inheritance.coding.demo3.abstraction;

public class PlayWithOperations {

    public static void main(String[] args) {
        String operation = "4 - 2";

        String[] elemnts = operation.split(" ");
        int leftOperand = Integer.parseInt(elemnts[0]);
        int rightOperand = Integer.parseInt(elemnts[2]);

        String symbol = elemnts[1];
        Operation op = Operation.of(symbol);
        int result = op.compute(leftOperand,rightOperand);
        System.out.println("Result = " + result);
    }
}
