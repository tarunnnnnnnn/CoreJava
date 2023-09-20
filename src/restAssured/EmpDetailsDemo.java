package restAssured;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDetailsDemo {

	public static void main(String[] args) {
			Map<String,Map<String,Object>> map4 = new HashMap<>();
			Map<String,Object> map5 = new HashMap();
			map5.put("name", "Cbyer");
			map5.put("EmpId", 100);
			map5.put("Address","pune");
			map5.put("Cities",Arrays.asList("pune","mumbai"));
			
			List<String> strings = Arrays.asList("Pune","mumbai");
			map4.put("empDetails", map5);
			System.out.println(map4);
			
			
			
			
	}

}
