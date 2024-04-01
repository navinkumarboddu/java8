package inheritance.coding.demo3.abstraction;

public abstract class Operation {

    public abstract int compute(int a, int b);

    public static Operation of(String symbol) {
        switch (symbol){
            case "+" : return new Addition();
            case "-" : return new Substraction();
            default: throw new IllegalStateException("Symbol " + symbol + " is unknown");
        }
    }
}
