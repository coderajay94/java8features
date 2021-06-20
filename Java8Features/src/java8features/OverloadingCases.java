package java8features;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class P{
	void m1(long l) {
		System.out.println("int args from Parent");
	}
}

class K extends P{
	void m1(long i) {
		System.out.println("int args from Kid");
	}
}


class Sum{
	
	public void add(int a, int b) throws Exception{
		System.out.println("integer method");
		System.out.println(a+b);
	}
	
	public double add(double a, double b) throws Exception {
		System.out.println("double method");
		return a+b;
	}
	
	
}


public class OverloadingCases extends Sum {

	public static void main(String args[]) throws Throwable{
		P k = new K();
		k.m1(0l);
		
		Sum obj = new Sum();
		obj.add(0, 0);
		List<String> randomList = getList(1);
		System.out.println(randomList.get(0));
	}
	
	
	public static List<String> getList(int i){
		List list;
		if(i==1) {
			list = new LinkedList<>();
			list.add("linkedList object");
			return list;
		}else {
			list = new ArrayList<>();
			list.add("ArrayList object");
			return list;
		}
	}
}
