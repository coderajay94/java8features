package java8features.CollectionsFmwrk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListPractice {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		System.out.println(employees.size());
		employees.add(new Employee("ak", 26, 12.5));
		System.out.println(employees.size());
		employees.add(new Employee("as", 26, 12.5));
		employees.add(new Employee("ag", 26, 12.5));
		employees.add(new Employee("ah", 26, 12.5));
		employees.add(new Employee("ai", 26, 12.5));
		employees.add(new Employee("ajay", 26, 12.5));
		employees.add(new Employee("al", 26, 12.5));
		employees.add(new Employee("am", 26, 12.5));
		employees.add(new Employee("am", 26, 12.5));
		employees.add(new Employee("ao", 26, 12.5));
		System.out.println(employees.size());
		employees.add(new Employee("ap", 26, 12.5));
		System.out.println(employees.size());

		for (Employee e : employees)
			System.out.println("employee name: " + e.getName());

		System.out.println(employees.get(0).name);
		employees.remove(0);
		System.out.println(employees.get(0).name);

		System.out.println(employees);

		Vector list = new Vector<Integer>();
		for (int i = 0; i < 11; i++)
			list.add(i);

		System.out.println(list.capacity());

		// Iterator example
		Iterator i = list.iterator();
		while (i.hasNext()) {
			Integer temp = (Integer) i.next();
			if (temp == 1)
				i.remove();

			System.out.println(temp);

		}
		
		
		while (i.hasNext()) {
			System.out.println(i.next());

		}
		LinkedList<String> ll = new LinkedList<>(); 
	    
        ll.add("Geeks"); 
        ll.add("Geeks"); 
		
		
		

	}
}

class Employee implements Comparable{
	String name;
	int age;
	double salary;

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee e2 = (Employee)o;
		return this.getAge()-e2.getAge();
	}
	
	
	
}