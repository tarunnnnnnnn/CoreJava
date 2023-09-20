package praticeforjava;

public abstract class TokenDemo {

	public static void main(String[] args) {
			
			String city ="I live in pune";
			String[]tokens = city.split("");
	
	
		for(String x : tokens)
		{
			System.out.println(x + " : " + x.length());
	
	}

}
}
