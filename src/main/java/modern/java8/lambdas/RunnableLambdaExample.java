package modern.java8.lambdas;

public class RunnableLambdaExample {

	public static void main(String[] args) {

		/*
		 * Prior Java 8
		 */
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Runnable !!!");
			}
		};

		new Thread(r).start();

		/*
		 * Java 8 Lambda Syntax
		 */
		Runnable r1 = () -> System.out.println("Inside Lambda Runnable !!!");

		new Thread(r1).start();

		new Thread(() -> System.out.println("Inside Lambda Runnable !!!")).start();
	}
}
