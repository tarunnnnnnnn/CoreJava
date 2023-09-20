package restAssured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestDemo {

	public static void main(String[] args) {
	
		List<Map<String,Integer>> arrayList3 = new ArrayList<>();
		Map<String,Integer> map1 = new HashMap<>();
		map1.put("num1", 1);
		map1.put("num2", 2);
		arrayList3.add(map1);
		 
		Map<String,Integer> map2 = new HashMap<>();
		map2.put("num2", 3);
		map2.put("num3", 4);
		arrayList3.add(map2);
		
		Map<String,Integer> map3 = new HashMap<>();
		map3.put("num4", 5);
		map3.put("num5", 6);
		arrayList3.add(map3);
		
		System.out.println("ArrayList" + arrayList3);
		
		
	
		
		
		
	}

}
