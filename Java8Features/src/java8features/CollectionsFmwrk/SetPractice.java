package java8features.CollectionsFmwrk;

import java.util.Comparator;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		
		int a=10;
		TreeSet<String> tree = new TreeSet<String>(new MyComparable());
		tree.add("ajy");
		tree.add("bobby");
		tree.add("caty");
	
		
		TreeSet<Employee> tree2 = new TreeSet<>(new Comp());
		tree2.add(new Employee("Ajay", 26, 20));
		tree2.add(new Employee("Babu", 21, 12));
		tree2.add(new Employee("Yash", 32, 15));
		
		//System.out.println(tree2);
		
		TreeSet<String> sorted = new TreeSet<String>(new MyComp());
		
		sorted.add("B");
		sorted.add("A");
		sorted.add("E");
		sorted.add("D");
		sorted.add("C");
		
		System.out.println(sorted);
		
		
		
	}
}



class MyComp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		System.out.println("o1:"+o1 +" and o2:"+o2);
		System.out.println(o1.compareTo(o2));
		return o1.compareTo(o2);
	}
	
	
	
}





class MyComparable implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.length()>(o2.length())?-1:+1;
	}

	
}


class Comp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.salary>o2.salary?1:-1;
	}
	
	
	
	
}


