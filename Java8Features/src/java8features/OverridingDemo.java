package java8features;

class Dad{
	public void m1() {
		System.out.println("dad m1 method");
	}
}

abstract class Kid extends Dad {
	public abstract void m1();
}

class L{
	private void m1() {
		
	}
}

class M extends L{
	public void m1() {
		//we can increase the scope but can;t decrease the scope from public to private etc.
	}
}

//var-args overloading not overriding
class O{
	public void m1(int...a) {
		System.out.println("parent");
	}
}
class H extends O{
	
	public void m1(int[] a) {
		System.out.println("child");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		O parent = new O();
		parent.m1(new int[] {21});

		H child = new H();
		child.m1(new int[] {21});
		
		O obj = new H();
		obj.m1(new int[] {21});
	}

}
