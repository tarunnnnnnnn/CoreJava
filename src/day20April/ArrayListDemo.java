package day20April;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
			List<Integer> abc = new ArrayList <>();
			abc.add(10);
			abc.add(30);
			abc.add(40);
			abc.add(40);
			abc.add(50);
			abc.add(10);
			System.out.println(abc);
			int ele =30u ;
			int occ = 0;
		
			for (int num :abc)
				if (num==ele);
				occ++;
				
				System.out.println(ele + occ);
			
		
			
			
			
			
	}

}
