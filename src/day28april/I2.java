package day28april;

interface A2{
	public void m1();
	public void m2();

}

public class I2{
	public static void main(String[] args) {
		A2 obj = new A2() {

			@Override
			public void m1() {
				System.out.println("called m1 method");
			}
		
		
		
			
				
			

			@Override
			public void m2() {
				System.out.println("call m2 method");
				
			}
		};
		obj.m1();
		obj.m2();
	}
	
}			
			
	
	
	
