	package praticeforjava;
	
	public class DemoLoop {
	
		public static void main(String[] args) {
			int number = 54;
	//		int count = number;
			int sum=0 ;
			
			 for (int i=1;i<=number/2;i++){
				if(number%i==0) {
					System.out.println("factors" +i);
				}
			sum+=i ;
			}
			 
				if(sum==number) {
					System.out.println("Perfect Number");
					}
				
			else {
				System.out.println("Not perfect");
			}
				 
			 }
		 
		}
	
	
