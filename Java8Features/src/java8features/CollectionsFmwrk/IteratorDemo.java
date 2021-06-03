package java8features.CollectionsFmwrk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		List list = new ArrayList<Integer>();
		for (int i = 0; i < 11; i++)
			list.add(i);
		
		

		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			int i = (Integer)itr.next();
			if(i==9) {
				itr.remove();
				System.out.println("item removed "+ i);
				break;
			}
		}
		
		ListIterator itr2 = list.listIterator();
		while(itr2.hasNext()) {
			int i = (Integer)itr2.next();
			if(i==0)
				itr2.remove();
			if(i==10) {
				itr2.set(9);
				itr2.add(10);
				
				System.out.println("item removed "+ i);
				break;
			}
		}
		
		for( Object j: list) {
			System.out.println("item : "+j);
		}
		
	}
}

