package java8features;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsDemo {

	public static void main(String args[]) throws IOException {

		// best video for quick understanding
		// https://www.youtube.com/watch?v=t1-YZ6bF-g0

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee("ajay", 12, 19));
		employees.add(new Employee("jumar", 22, 22));
		employees.add(new Employee("akay", 62, 12));
		employees.add(new Employee("raajay", 13, 10));
		employees.add(new Employee("ajay", 12, 19));

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(12);
		numbers.add(23);
		numbers.add(90);
		numbers.add(89);
		numbers.add(12);

		employees.stream().filter(e -> e.salary > 15 && e.getName().startsWith("a")).filter(e -> e.salary != 0)
				.forEach(e -> System.out.println(e.getName()));

		long count = employees.parallelStream().filter(e -> e.getAge() > 18).count();

		System.out.println("people with age above 18 are: " + count);

		numbers.stream().distinct().forEach(System.out::println);

		IntStream.range(1, 10).skip(5) // skipped first 5 elements
				.forEach(e -> System.out.println(e));

		System.out.println(IntStream.range(3, 12).skip(3).sum());

		employees.stream().findFirst().ifPresent(System.out::println);

		employees.stream().sorted().findFirst().ifPresent(System.out::println);

		String[] array = new String[] { "dello", "dorld", "ajay", "kumar", "data", "structures" };

		Arrays.stream(array).filter(e -> e.startsWith("d")).sorted().forEach(System.out::println);
		System.out.println("-------------------------------------------------");
		
		List<Employee> salariedEmployess = employees.stream().filter(e-> e.getSalary()>21).collect(Collectors.toList());
		salariedEmployess.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------");
		
		// average of squares of an int array
		Arrays.stream(new int[] { 23, 3, 54, 23 }).map(x -> x * x).average().ifPresent(System.out::println);

		// Stream from list and filter and print it
		employees.stream().filter(e -> e.getName().startsWith("A")).forEach(System.out::println);

		// stream file, read lines, sort filter and print
		//Stream<String> bands = Files.lines(Paths.get("Users\\radx9\\git\\java8features\\Java8Features\\src\\java8features\\bands.txt"));

		//bands.sorted().filter(e -> e.length() > 12).forEach(System.out::println);
		//bands.close();

		 List<Employee> list= employees.stream()
		.sorted()
		.filter(e-> e.getAge()>18)
		.collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
		System.out.println("*******************************");
		List<String> ls = new ArrayList<>();
		ls = employees.stream()
		.map(e-> e.getName())
		.filter(n-> n.startsWith("A"))
		.collect(Collectors.toList());
		//.forEach(System.out::println);
		
		System.out.println(ls);
		
		System.out.println("***********-------********************");
		employees.stream()
		.map(e->e.getSalary())
		.filter(s->s>10)
		.forEach(System.out::println);
		
		
		//reduce function pending
		
	}
}
