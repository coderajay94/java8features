package java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitTestExSolutionJava7 {

	public static void main(String[] args) {
	
		
		List<Student> people = Arrays.asList(
				new Student("ajay", "kumar", 26),
				new Student("deepak", "babu", 21),
				new Student("raghu", "kumar", 22),
				new Student("ashwani", "kumar", 16),
				new Student("yash", "kumar", 54)
				);

		//step 1: sort list by last name
		Collections.sort(people, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
			
		});
		
		
		//Step 2: create method that prints all the elements
		
		for(Student s: people) {
			System.out.println(s);
		}
		
		//Step 3: create a method that prints all the people starting name with a
		
		


	

}
}