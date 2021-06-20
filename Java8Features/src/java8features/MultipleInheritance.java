package java8features;

interface A{
    
void m1();
}


class B implements A{

	@Override
	public void m1() {
		System.out.println("from B class");
		
	}
    

}

class C implements A{

	@Override
	public void m1() {
		System.out.println("from C class");
		
	}
    

}


public class MultipleInheritance {

	public static void main(String[] args) {
		A a = new B();
		a.m1();

		Math.abs(0);
	}

}
