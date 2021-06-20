package java8features;

class Parent{
	void m1() {
		System.out.println("m1 method from parent");
	}
}

class Child extends Parent{
	
	void m1() {
		System.out.println("m1 method from child");
	}
}
public class Test {

	public static void main(String[] args) {
		Child p = new Child();
		p.m1();
		//p.m2();
		Object obj;

	}

}
