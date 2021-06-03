package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeUsingLambda {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee("ajay", 12, 19));
		employees.add(new Employee("jumar", 22, 22));
		employees.add(new Employee("akay", 62, 29));
		employees.add(new Employee("raajay", 13, 10));
		
		
		List<Integer> numbers = new ArrayList<Integer> ();
		numbers.add(62);
		numbers.add(22);
		numbers.add(12);
		numbers.add(10);
		numbers.add(90);
		
		Collections.sort(numbers, new MyComp());
		
		System.out.println(numbers);
		
		Collections.sort(employees, (obj1, obj2)-> {
		 Integer num1 = obj1.getAge();
		 Integer num2 = obj2.getAge();
		 return num1.compareTo(num2);
	});
		
		
		printEmployees(employees, (p)-> p.getName().startsWith("a"));
		
		
		for(Employee e: employees) {
			//System.out.println(e);
		}
		
		
	}

	private static void printEmployees(List<Employee> employees, Predicate<Employee> p) {
		for(Employee e: employees) {
			if(p.test(e)) {
			System.out.println(e);
		}
		
	}

}
}



class MyComp implements Comparator<Integer>
{
	@Override
	public int compare(Integer one, Integer two) {
		return one.compareTo(two);
	}
	
}