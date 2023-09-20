package restAssured;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(89);
		list.add(true);
		list.add("abc");
		
		System.out.println(list);
		
		List<String> ArrayList1 = new ArrayList();
		ArrayList1.add("mumbai1");
		ArrayList1.add("pune1");
		
		System.out.println(ArrayList1);
		
		List<String>ArrayList2 = new ArrayList();
		ArrayList2.add("Pune2");
		ArrayList2.add("mumbai2");
		System.out.println(ArrayList2);
		System.out.println(ArrayList2.get(0));
		System.out.println(ArrayList2.get(1));
		
		
		
		
	}

}
