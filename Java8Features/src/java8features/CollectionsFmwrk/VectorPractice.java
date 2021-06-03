package java8features.CollectionsFmwrk;

import java.util.Enumeration;
import java.util.Vector;

public class VectorPractice {

	public static void main(String args[]) {
		
		Vector vector = new Vector();
		vector.add(12);
		vector.add(42);
		vector.add(17);
		vector.add(92);
		System.out.println(vector.contains(12));
		
		Enumeration enm = vector.elements();
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
		
	}
}
