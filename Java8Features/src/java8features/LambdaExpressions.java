package java8features;

public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLambda lambda = () -> System.out.println("hello world");
		lambda.foo();

		AddLambda lambda2 = (a, b) -> System.out.println(a + b + " is the total sum");
		lambda2.add(12, 42);

		DivideLambda divideLambda = (a, b) -> {
			if (b != 0)
				return a / b;
			else
				return 0;
		};

		System.out.println("division is:" + divideLambda.divide(12, 0));

		printLength((s) -> s.length());
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread has been started");
				
			}
		});
		
		thread.run();
		
		Thread thread2 = new Thread(()->System.out.println("thread2 started via lambda"));
		thread2.start();

	}

	// lots of type inference happening in below examples
	interface StringLength {
		int getLength(String s);
	}

	public static void printLength(StringLength lambda) {
		System.out.println("length: " + lambda.getLength("Hello Lambda"));
	}

}

interface DivideLambda {
	int divide(int a, int b);
}

interface MyLambda {
	void foo();
}

interface AddLambda {
	void add(int a, int b);

}