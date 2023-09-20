package pkg1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDEmo {

	public static void main(String[] args) {
			List al = new ArrayList<>();
			System.out.println(al);
			al.add(10);
			al.add(55);
	//		System.out.println(al);
	//al.add(null);
	//	/	System.out.println(al);
	//		System.out.println(al.get(2));
//			System.out.println(al.size());
//			for(int i=0;i<=al.size()-1;i++)
//				System.out.println(i);
//			boolean res = al.remove(null);
		//	System.out.println(res);
	//		res = al.remove(al);
//	System.out.println(al);
			
			Iterator iter = al.iterator();
			while(iter.hasNext())
				System.out.println(iter.next());
			
			
			
			
			
			
			
			
			
			
			
	}
						
}
