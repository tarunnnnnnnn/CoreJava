package day28april;
interface I3{
	public void m1(int a , int b, int c);
	
}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		I3 obj = (a ,b ,c ) -> System.out.println("Addition  = " + (a+b));
		obj.m1 (10,20 ,40);
		obj.m1(30,40,30);
			
		
		
	}

}
