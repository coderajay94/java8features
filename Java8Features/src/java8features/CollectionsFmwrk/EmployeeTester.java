package java8features.CollectionsFmwrk;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class EmployeeTester {

	public static void main(String[] args) {
		
		//List<Employee> employees = new ArrayList<Employee>();
		List<Employee> employees = new Stack<Employee>();
		
		employees.add(new Employee("ajay", 12, 20));
		employees.add(new Employee("kumar", 22, 20));
		employees.add(new Employee("akay", 62, 20));
		employees.add(new Employee("raajay", 13, 20));
		
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee obj1, Employee obj2) {
				return obj1.getName().compareTo(obj2.getName());
			}
		});
		
		for(Employee e: employees) {
			System.out.println(e);
		}
		
		//System.out.println(employees);
	}
	
	

}

class Com implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return - o1.compareTo(o2);
	}
	
}


