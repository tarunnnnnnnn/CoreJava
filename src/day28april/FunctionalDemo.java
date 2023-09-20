package day28april;

interface I1
{
	public void m1();

	public void m2();

}
class I implements I1
{

	@Override
	public void m1() {
		System.out.println("i am inside this M1 method");
	}

	@Override
	public void m2() {
			System.out.println("i am inside m2 method ");
	}
	
}
public class FunctionalDemo{
	public static void main(String[] args) {
		I1 obj = new I();
		obj.m1();
		obj.m2();
		
	}
}




