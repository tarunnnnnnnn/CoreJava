package restAssured;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcerciseDemo {

	public static void main(String[] args) {
		List<String,Object> map = new ArrayList<>();
		Map<String,Map<String,Object>> map1 = new HashMap<>();
		Map<String,Object> map2 = new HashMap<>();
		map2.put("name","cbyer");
		map2.put("empId", 100);
		map2.put("Salary",20000);
		
		Map<String,Object> map3 = new HashMap<>();
		map3.put("name","success");
		map3.put("emdId", 1001);
		map3.put("Salary",30000);
		
		Map<String,Object> map4 = new HashMap<>();
		map4.put("name", "api");
		map4.put("emdId",101);
		map4.put("Salary",40000);
		
		map2.put("ComapanyName","Tcs");
		map2.put("City", "pune");
		 
		map1.put("Data", map4);
		map1.put("Data", map3);
		map1.put("data", map2);
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
/*	map2.put("city",map3);
		map3.put("pune",map4);
		
		map1.put("ComapanyName" ,map2 );
		map1.put("Tcs", "companyNAme");
		System.out.println(map1);
*/	
		
		
		
		
		
		
		
		
	}

}
