package restAssured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestDemo2 {

	public static void main(String[] args) {
		List<Map<String,List<Integer>>> arrayList4 = new ArrayList<>();
		Map<String,List<Integer>> map = new HashMap<>();
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		map.put("ids", list1);
		arrayList4.add(map);
		
		System.out.println(arrayList4);
		
		
		
	}

}
