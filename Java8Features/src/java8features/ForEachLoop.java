package java8features;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop implements Printer {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee("ajay", 12, 19));
		employees.add(new Employee("jumar", 22, 22));
		employees.add(new Employee("akay", 62, 29));
		employees.add(new Employee("raajay", 13, 10));
		
		/*System.out.println("Traditional for loop");
		//traditional for loop
		for(int i=0;i<employees.size();i++)
			System.out.println(employees.get(i));

		System.out.println("Traditional for in loop");
		// for in loop
		for(Employee e: employees)
			System.out.println(e);
		*/
		
		System.out.println("java 8 for each loop");
		//employees.forEach(e-> System.out.println(e));
		
		employees.forEach(System.out::println);
		
		
	}

	@Override
	public void print(Employee e) {
		System.out.println(e.getName());
	}

}

@FunctionalInterface
interface Printer{
	void print(Employee e);
}
