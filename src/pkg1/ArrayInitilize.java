	package pkg1;

import java.util.ArrayList;
import java.util.List;

public class ArrayInitilize {

	public static void main(String[] args) {

		List al = new ArrayList<>();
		{
			{
				al.add(10);
				al.add("virat");
				al.add(true);
				al.add(0.001);
				
			};
			System.out.println(al);
			
		al.remove(1);
		System.out.println(al);
			
		}
	}
}
		

		
	
		

		
