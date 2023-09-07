package in28Minutes.fpwj.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03SupplierAndUnaryOperator {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		System.out.println("Function Implementation...");
		
		Predicate<Integer> isEvenPredicate = x -> x%2==0;
		
		Function<Integer,Integer> squareFunction = x -> x*x;
		
		Consumer<Integer> sysoutConsumer = x -> System.out.println(x);
		
		BinaryOperator<Integer> sumBinaryOperator = (x,y) -> x+y;
		
		//No Input -> Return Something
		Supplier<Integer> randomIntegerSupplier =  () -> {
			Random random = new Random();
			return random.nextInt(100);	
		};
		
		sysoutConsumer.accept(randomIntegerSupplier.get());
		
		UnaryOperator<Integer> unaryOperator = (x) -> 3*x;
		
		sysoutConsumer.accept(unaryOperator.apply(5));
	}
}
